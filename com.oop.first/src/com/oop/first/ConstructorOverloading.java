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
public class ConstructorOverloading {

    
        public ConstructorOverloading(int a){
            System.out.println(a);
            
        }
        public ConstructorOverloading(String a){
            System.out.println(a);
        }
            
        
        public ConstructorOverloading(String b, String c){

        System.out.println(b+" "+c);

    }
        public static void main(String[] args){
        new ConstructorOverloading(1);
        new ConstructorOverloading("ram");
        new ConstructorOverloading("shyam","hari");

        }
}

        
    
