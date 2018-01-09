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
public class WhileLoopClasswork {
    public static void main(String[] args){
        int upin=1234;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your pin:");
        int pin=a.nextInt();
        
        while(pin!=upin){
        System.out.println("Invalid pin.Enter your pin again");
        
        pin=a.nextInt();
        
        
        }
        System.out.println("Welcome");
        
                }            
         
                 
            
         }
        
        
    

