/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basanta.first;

import java.util.Scanner;

/**
 *
 * @author Basanta
 */
public class UserInputClasswork {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = x.nextLine();
        System.out.println("Your name is "+name );
        System.out.println("Are you male or female?");
        String gender=x.nextLine();
        System.out.println("You are a "+gender);
        System.out.println("Enter your age ");
        int age=x.nextInt();
        System.out.println("Your age is "+age);
        if(gender.equals("male")){
            if(age>=60){
                System.out.println("I will call you grandpa");}
                else 
                if(age>=35&&age<60){
                        System.out.println("i will call you uncle");
                        }
                else{
                    System.out.println("i will call you brother");
                }
                        }
           
        
        
        else if(gender.equals("female")){
            if(age>=60){
                System.out.println("I will call you grandma");
            }
                else 
                if(age>=35&&age<60){
                        System.out.println("i will call you aune");
                        }
                else{
                    System.out.println("i will call you sister");
    }
        }
        else{
            System.out.println("Exit");
        }
    }
}


