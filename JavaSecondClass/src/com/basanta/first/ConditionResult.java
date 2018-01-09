/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basanta.first;

/**
 *
 * @author Basanta
 */
public class ConditionResult {
    public static void main(String[] args){
        int x=90;
      
        if (x>=40&&x<60){
            System.out.println("Second Division");}
            else if(x>=60&&x<80){
               System.out.println("First Division");                                
                    }
            else if(x>=80&&x<100){
                System.out.println("Distinction");
            }
            else{
                System.out.println("Fail");
            }
        }
       
    }
