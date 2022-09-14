/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.Timer;

/**
 *
 * @author Sebastianh
 */
public class methods {

    public static String Happy() throws FileNotFoundException {

        File filehappy = new File("data\\happyq.txt");

        Scanner sc = new Scanner(filehappy);
        sc.useDelimiter("#");

        int rand = (int) Math.random() * (5 - 0) + 0;
        String sc_str = "";
        int sc_int;
        
        while (sc.hasNext()) {
            Scanner scanLine = new Scanner(sc.nextLine());
            scanLine.useDelimiter("#");
            sc_int = scanLine.nextInt();
         
            
            if (sc_int == rand) {
                   sc_str = scanLine.next();
                
            }
            
        }
       
          
        
        
        return sc_str;

    }
    
}

//Timer method
//public static int Timer(int num){
//final ScheduledExecutorService scheduler = 0;

