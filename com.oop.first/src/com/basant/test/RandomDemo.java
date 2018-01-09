/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basant.test;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Basanta
 */
public class RandomDemo {
    
    public static void main(String[] args) {
        
    
    Random rd = new Random();
    int a = 1+rd.nextInt(100);
        
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the random number from 1-100:");
    int b = sc.nextInt();
//    if (a==b){
//        System.out.println("Right Guess");
//        
//    }
//    else if(a>b){
//        System.out.println("guess number is too low.");
//    }
//    
//    else {
//        System.out.println("guess number is too high.");
//    }
    int count=2;
    while(a!=b&& count<7){
        
        
    if(a>b){
        System.out.println("guess number is too low.");
    }
    
    else if(a<b){
        System.out.println("guess number is too high.");
    }
    System.out.println("Enter the random number:Guess "+count+":");
        b = sc.nextInt();
        count++;
    }
    if (a==b){
        System.out.println("Right Guess");
        
    }
    else{
        System.out.println("Limit exceed..Exit");
    }
}
}