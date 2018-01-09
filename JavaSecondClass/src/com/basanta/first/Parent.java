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
public class Parent {
    public void m1(){
        int age = 40;
        System.out.println("Hello, Welcome to public");
    }
    public Parent(){
        System.out.println("beats audio");
    }
    
    
    private void m2(){
        System.out.println("Hey");
    }
    protected void m3(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.m1();
        obj.m2();
        obj.m3();
            
       
        }
        
    }

