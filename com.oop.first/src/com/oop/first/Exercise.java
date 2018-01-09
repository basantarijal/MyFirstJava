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
public class Exercise {
  static int age = 40;
    
    
    public void myAge(int age){
        System.out.println("the age is "+age);
        System.out.println("the age is "+this.age);
    }
    public static void main(String[] args){
        
        Exercise age = new Exercise();
        age.myAge(20);
    }
}
//this keyword is used when global variable is needed..within the same method ........