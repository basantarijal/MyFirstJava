/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basanta.first;

/**
 *
 * @author Basanta
 */
public class WrapperDemo {
    //Wrapper class : Auto boxing and unboxing
    //autoboxing : converting data type to object
    //unboxing : converting object ot data type
    
    public static void main(String[] args) {
        int a = 4;
        Integer b = a;// autoboxing gareko 
        Integer f = Integer.valueOf(a);
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);
        Integer c = b. intValue();
        Integer d  = new Integer(7);
        int e = d.intValue();//unboxing
        //(object to data type)
        
        
               
    }
}
