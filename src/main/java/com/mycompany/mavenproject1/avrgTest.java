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
public class avrgTest {
    public static void main(String[] args) {
        
        int sum = 0;
        
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("pls"));
            System.out.println(num);
            sum += num;
            int avg = sum/10;
            
            
            System.out.println(avg);
        }
        
        
    }
}
