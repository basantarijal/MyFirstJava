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
public class PinCode {
    public static void main(String[] args) {
        int x = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the PIN:");
        int y;
        y = sc.nextInt();
        int i=0;
        
        while(x!=y&&i<2){
            System.out.println("Wrong PIN..Enter again");
            y = sc.nextInt();
            i++;
        }
        if(y==1234){
        System.out.println("Welcome");
        }
        else{
            System.out.println("Sorry");
        }
            
        }
        
    }


    
    
    

