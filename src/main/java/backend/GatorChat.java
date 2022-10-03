/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author user-pc
 */
public class GatorChat {

    public Map<String, GatorQuestion> questions;

    public void loadQuestions() {

        //creates json parser
        JSONParser jsonParser = new JSONParser();
        String jsonPath = "src/main/assets/json/gatorprompts.json";

        //make new json reader
        try {
            FileReader reader = new FileReader(jsonPath);
            //gets return of parsing which is an object
            Object jsonObject = jsonParser.parse(reader);
            parseQuestions((JSONArray) jsonObject);
            //catches in case of error
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void parseQuestions(JSONArray jsonArray) {

        //creates a hashmap (code dictionary) thats key is String and value is Question (custom data type)
        questions = new HashMap<String, GatorQuestion>();

        //goes thru all code via finding length and looping for said length
        for (int i = 0; i < jsonArray.size(); i++) {

            //makes a Question type variable name qParse that corresponds with current i position
            GatorQuestion qParse = questionParse((JSONObject) jsonArray.get(i));
            //Puts into hasmap
            questions.put(qParse.id, qParse);
        }
    }

    //Question is a custom data type created
    private GatorQuestion questionParse(JSONObject jOb) {

        //creates json object that draws from json file under question (object)
        JSONObject questionObj = (JSONObject) jOb.get("question");

        //assigning values for ID and actual text of questions
        GatorQuestion gatorQuestion = new GatorQuestion();
        gatorQuestion.id = (String) (questionObj.get("questionID"));
        gatorQuestion.theQuestion = (String) (questionObj.get("theQuestion"));

        //array used for options
        JSONArray optionArray = (JSONArray) questionObj.get("options");
        gatorQuestion.options = new GatorOptions[optionArray.size()];
        for (int i = 0; i < optionArray.size(); i++) {
            GatorOptions option = parseOptions((JSONObject) optionArray.get(i));
            gatorQuestion.options[i] = option;
        }

        return gatorQuestion;

    }

    //method for parsing them options [:
    private GatorOptions parseOptions(JSONObject optObj) {
        JSONObject jsonOptionObject = (JSONObject) optObj.get("option");
        GatorOptions gatorOption = new GatorOptions();
        gatorOption.id = (String) jsonOptionObject.get("optionsID");
        gatorOption.image = (String) jsonOptionObject.get("image");
        gatorOption.nextQuestionId = (String) jsonOptionObject.get("nextQuestionID");
        gatorOption.theResponse = (String) jsonOptionObject.get("optiontext");

        return gatorOption;
    }

}
