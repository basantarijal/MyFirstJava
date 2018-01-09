/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.first;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Basanta
 */
public class Game {
    static int c;
    static int b;
    
    public void Guess(){
        
        
    Scanner sc = new Scanner(System.in);    
    int count=2;
    while(c!=b&& count<7){  
        
    if(c>b){
        System.out.println("guess number is too low.");
    }
    
    else if(c<b){
        System.out.println("guess number is too high.");
    }
    
    System.out.println("Enter the random number:Guess "+count+":");
        b = sc.nextInt();
        count++; 
    }
    }
    
    public static void main(String[] args) {
        Random rd = new Random();
        int a = 1+rd.nextInt(100);
        c=a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the random number from 1-100:Guess1:");
        b = sc.nextInt();
        Game ga = new Game();
        ga.Guess();
         if(c==b){
             System.out.println("Correct guess");
         }
         else{
             System.out.println("Exit");
         }
    }  
    }

