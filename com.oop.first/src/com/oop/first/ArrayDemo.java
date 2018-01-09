/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.first;

/**
 *
 * @author Basanta
 */
public class ArrayDemo {
    public static void main(String args []){
        int x=10;
        int[] y= {1,2,3};
        System.out.println(y[1]);//Integer arary
        String [] name = {"Saroj" ,"Amit", "Basanta","Sayantha"};
        System.out.println("My name is "+name[2]+".");//String array
        Object[] person = {"Rijal",10,"Bhandari",20};//both integer and string lai lincha
        System.out.println("My surname is "+person[0]+" and I have "+person[1]+" rupees");
        
//        Array is a data structure that holds multiple value( or data) at a time 
//        unlike the varialble     
            for (int c=0;c<y.length;c++){
                System.out.println(y[c]);
                
            }for(int d= 0;d<name.length;d++){
                System.out.println(name[d]);
            }
            
    }
 
}
