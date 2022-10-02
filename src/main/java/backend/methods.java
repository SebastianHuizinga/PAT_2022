/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Sebastianh
 */
public class methods {

    public static int Rando(int high, int low) {
        int rando = (int) (Math.random() * (high - low) + low);

        return rando;
    }

    public static String Happy(int num) throws FileNotFoundException {

        File filehappy = new File("data//happyq.txt");

        Scanner sc = new Scanner(filehappy);
        sc.useDelimiter("#");

        int rand = (int) (Math.random() * (6 - 1) + 1);
        String sc_str = "";
        int sc_int;

        while (sc.hasNext()) {
            Scanner scanLine = new Scanner(sc.nextLine());
            scanLine.useDelimiter("#");
            sc_int = scanLine.nextInt();

            if (sc_int == num) {
                sc_str = scanLine.next();

            }

        }
        return sc_str;
    }

    public static String[] Happy_ans(int num) throws FileNotFoundException {

        File filehappy_a = new File("data//happya.txt");
        Scanner sc2 = new Scanner(filehappy_a);
        sc2.useDelimiter("#");
        String ans1 = "";
        String ans2 = "";
        int ans_num;
        int ansval1;
        int ansval2;
        while (sc2.hasNext()) {
            Scanner scanLine2 = new Scanner(sc2.nextLine());
            scanLine2.useDelimiter("#");
            ans_num = scanLine2.nextInt();
            if (ans_num == num) {
                ans1 = scanLine2.next();
                ansval1 = scanLine2.nextInt();
                ans2 = scanLine2.next();
                ansval2 = scanLine2.nextInt();
            }
        }
        String returnAns[] = {ans1, ans2};

        return returnAns;

    }

    public static int[] Happy_ansval(int num) throws FileNotFoundException {

        File filehappy_a = new File("data//happya.txt");
        Scanner sc2 = new Scanner(filehappy_a);
        sc2.useDelimiter("#");
        int ans_num;
        int ansval1 = 0;
        int ansval2 = 0;
        while (sc2.hasNext()) {
            Scanner scanLine2 = new Scanner(sc2.nextLine());
            scanLine2.useDelimiter("#");
            ans_num = scanLine2.nextInt();

            if (ans_num == num) {
                String ans1 = scanLine2.next();
                ansval1 = scanLine2.nextInt();
                String ans2 = scanLine2.next();
                ansval2 = scanLine2.nextInt();
            }
        }
        int returnAnsval[] = {ansval1, ansval2};

        return returnAnsval;

    }
    
      public static String[] GetQuest(){
          
          
          
          
        
        return null;
        
    }
    
      public static String[] GetOpt(){
        
        return null;    
        
    }
    
    public static String[] GetResponse(){
        
        return null;
        
    }
    

}

//Timer method
//public static int Timer(int num){
//final ScheduledExecutorService scheduler = 0;

