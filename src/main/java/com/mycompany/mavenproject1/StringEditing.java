/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class StringEditing {

    public static void main(String[] args) {
        String string1 = JOptionPane.showInputDialog("stirng1");
        String string2 = JOptionPane.showInputDialog("stirng2");

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Option 1; Print letter 1 and last  \n Option 2 Uppercase and second lowercase Opt3 Print word if same"));

        switch (choice) {
            case 1:
                System.out.println(string1.charAt(0) + " " + string2.charAt(string2.length() - 1));
                break;
            case 2:
                System.out.println(string1.toUpperCase() + " " + string2.toLowerCase());
                break;
            case 3:
                if(string1.equals(string2)){
                    System.out.println("They match");
                }
                    else{
                            System.out.println("no");
                            }
                
        }
    }
}


