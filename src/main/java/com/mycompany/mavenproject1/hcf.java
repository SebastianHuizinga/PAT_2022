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
public class hcf {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("num1 pls"));
        int num2  = Integer.parseInt(JOptionPane.showInputDialog("num 2 pls"));
        int hcf =1;
        
        for (int i = 1; i < num1; i++) {
            if(num1 % i == 0 && num2 % i ==0){
                hcf = i;
            }
            
            
            
        }
        System.out.println(hcf);
    }
}
