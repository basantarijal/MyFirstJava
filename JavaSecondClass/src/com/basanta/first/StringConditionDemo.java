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
public class StringConditionDemo {
    public static void main(String[] args){
        String name="ram";
        if(name.equals("Ram")){
            System.out.println("the name of the boy is ram");
        }else if(name.equalsIgnoreCase("Ram")){
            System.out.println("His name is ram");
        }
        else{
            System.out.println("the name of the boy is shyam");
        }
    }
}
