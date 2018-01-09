/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.first;

import java.util.Scanner;

/**
 *
 * @author Basanta
 */
public class BMI {
    static float wt,ht,bmi;
    public float BMICalc(){
        bmi = wt/(ht*ht);
        return bmi;
    }
    public static void main(String[] args) {
        BMI bm= new BMI();
        System.out.println("Welcome to BMI calculation");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your weight in kg:");
        wt = sc.nextFloat();
        System.out.println("Enter your heright in meter:");
        ht= sc.nextFloat();
        System.out.println("Your BMI index is"+bm.BMICalc());
        
    }
    
    
    
    
}
