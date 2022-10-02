/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author user-pc
 */
public class dialogueMethods {
    
    
    public static void Dialogue(int QuestionNum,JSONObject questions){
    
    JSONParser jsonParser = new JSONParser();         
         
         try (FileReader reader = new FileReader("gatorprompts.json"))     
         {
             Object question = jsonParser.parse(reader);
             JSONArray questionArray = (JSONArray) question;
             JSONObject questionObject = (JSONObject) questions.get("question");
             String questionID = (String) questionObject.get("questionID");
             String theQuestion = (String) questionObject.get("theQuestion");
             
            ArrayList<String> Qtext = new ArrayList<String>();
            Qtext.add(questionID);
            Qtext.add(theQuestion);
            
             
             
            } catch (FileNotFoundException e) {
             e.printStackTrace();
             
         } catch (IOException e) {
             e.printStackTrace();
         } catch (ParseException ex) {
            Logger.getLogger(dialogueMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return;
         }
}
