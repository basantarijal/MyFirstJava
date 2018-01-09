/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basant.test;

/**
 *
 * @author Basanta
 */
public class Homework1 {
    public static void main(String[] args) {
        int i;
        int j;
        
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++)
                if(j>=6-i){
                System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
                
            
            System.out.println();
        }
        
    }
    
    
}
