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
public class BasantaRijal {
    
    public void eat(){
        System.out.println("i am hungry");
        
    }
    public void sleep(int a){
        System.out.println("i love sleeping "+a+" hours");
       
    }
    public void work(){
        System.out.println("I dont have any work");
        
    }
    public static void main(String args []){
        BasantaRijal daily= new BasantaRijal();
        daily.eat();
        daily.sleep(12);
        daily.work();
    }
}


