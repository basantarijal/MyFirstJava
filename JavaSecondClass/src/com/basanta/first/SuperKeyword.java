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
public class SuperKeyword extends Parent {
    int age = 30;
    @Override
    public void m1(){
        System.out.println("Namaste");
        super.m1();
        System.out.println(age);
        
    }
    public static void main(String[] args) {
        SuperKeyword a = new SuperKeyword();
       a.m1();
       
       
    }
}
