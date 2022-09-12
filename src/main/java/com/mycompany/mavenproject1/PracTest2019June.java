/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author user-pc
 */
public class PracTest2019June {

    static int totalEggs;
    static int totalPower = 0;
    static int highestPower = 0;
    
    
    static void oneDay() {
        int numEggs = (int) (Math.random() * 9 - 2) + 2;
        if (numEggs > totalEggs) {
            numEggs = totalEggs;
        }
        totalEggs -= numEggs;

        System.out.println("Total Eggs; " + totalEggs);
        System.out.println("Eggs for the day; " + numEggs);
        String eggType = "";
        int eggPower = 0;

        for (int i = 1; i < numEggs + 1; i++) {
            int eggrando = (int) (Math.random() * 4 - 1) + 1;
            
            if (eggrando == 3) {
                eggType = "Zombie";
                eggPower = 175;

            } else if (eggrando == 2) {
                eggType = "Vampire";
                eggPower = 320;

            } else if (eggrando == 1) {
                eggType = "Elf";
                eggPower = 430;

            }
            totalPower += eggPower;
                    
                System.out.println("Egg " + i + " Type; " + eggType + " Power; " + eggPower);
           
               

        }
             
         
         System.out.println("Total power fo today " + totalPower);
         
         
         //if (highestPower < totalPower){
                //highestPower = totalPower;
               //}
         
         totalPower = 0;
    }

    public static void main(String[] args) {
        totalEggs = 25;
         
        int Day = 0;
        int highestPower = totalPower;
                      int highDay =1;
        
        for (int l = 1; l < 8; l++) {
            System.out.println("Day;" + l);
              oneDay();
               
           
         if (highestPower < totalPower){
                highestPower = totalPower;
                highDay = l;
               }
              
              
             // if (highestPower < totalPower){
                 // Day = l;
             // }
              
        }
        System.out.println("Highest power is;" + highestPower);
        System.out.println("day:" + highDay);
    }

}
