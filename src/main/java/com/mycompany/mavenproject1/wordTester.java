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
public class wordTester {
    
    static String word(String Word){
       int length = Word.length();
       int charRand = (int) (Math.random()*length + 1 - 1)*1;
        System.out.println(Word.charAt(charRand));
        System.out.println(Word);
        System.out.println(length);
        return null;
            
        
    }
    
    public static void main(String[] args) {
        //String Word = JOptionPane.showInputDialog("wat wprd");
      // /    //int length = Word.length();
       //int charRand = (int) (Math.random()*length + 1 - 1)*1;
        //System.out.println(Word.charAt(charRand));
        //System.out.println(Word);
        //System.out.println(length);
        word(Hey);
    }
    
}
