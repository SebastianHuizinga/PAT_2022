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

    public static String Happy() throws FileNotFoundException {

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

            if (sc_int == rand) {
                sc_str = scanLine.next();

                //File filehappy_a = new File("data//happya.txt");
                //Scanner sc2 = new Scanner(filehappy);
                //sc2.useDelimiter("#");
                // String ans1 = "";
                //String ans2 = "";
                //int ans_num;
                // int ansval1;
                // int ansval2;
                // while (sc2.hasNext()) {
                //  Scanner scanLine2 = new Scanner(sc.nextLine());
                //  scanLine2.useDelimiter("#");
                // ans_num = scanLine.nextInt();
                //  if (ans_num == rand) {
                //    ans1 = scanLine2.next();
                //  ansval1 = scanLine2Int.next();
                //   ans2 = scanLine2.next();
                //   ansval2 = scanLine2Int.next();
                //    }
                //   }
            }

        }
        return sc_str;
    }
}

//Timer method
//public static int Timer(int num){
//final ScheduledExecutorService scheduler = 0;

