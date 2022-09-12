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
public class SecretNumber {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Num please"));
        
        if(num % 2 == 0 && num % 7 == 0){
        System.out.println("You can enter");
       
    }
        else{
      System.out.println("You may not enter");
    }   
       
 
    }
}  
