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
public class FinalDemo {
    
        /* final could be the variable , method, class
        if the variable is final its value cannot be overriden
        if the methods is final than it cannto be overriden
        if the class is final then  it cannot be inherited
        */
        final int a = 7;//global variable
        public void a1(){
            System.out.println(a);
        }
        public void a2(int a){
            a=8;
            System.out.println(a);
        }
        public static void main(String[] args) {
            FinalDemo sc = new FinalDemo();
            sc.a1();
            sc.a2(2);
        }
        
                             
    }

