/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import javax.swing.*;
/**
 *
 * @author user-pc
 */
public class mathTest {
    
    static double round(double num){
        num = Double.parseDouble(JOptionPane.showInputDialog("wjat num"));
        System.out.println(Math.round(num));
        
        return 0;
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        round(16.78);
        
    }
    
}
