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
public class ConstructorDemo {
    public void ram(){
        System.out.println("Ram");
    }
    public ConstructorDemo(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        ConstructorDemo construct=new ConstructorDemo();
        construct.ram();
    }
        /* Constructor is a special type of method that doesnot have return type or void 
        and also it has the same name as that of the class name. It calls itself when object is created 
        (it need not to be called by an object.
        It runs first in the program.*/
        
       
       
        
    
   
}
