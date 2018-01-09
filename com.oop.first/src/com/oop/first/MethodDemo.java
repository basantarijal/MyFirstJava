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
public class MethodDemo {
    
    public void method1(){
        System.out.println("Hello");
    }
    public void method2(int a){
        System.out.println(a);
        
    }
    public void method3(int a, int b){
        System.out.println(a);
       
    }
    public void method4(String a){
        System.out.println(a);
    }
    public void method5(String a, int b){
        System.out.println(a);
    }
    
    public static void main(String[] args){
        MethodDemo hp = new MethodDemo();
        //new MethodDemo();
        //MethodDemo Lenovo;
        hp.method1();//Method call gareko(obejct.method ko name)
    hp.method2(1);
    hp.method3(1,1);
    hp.method4("Hey");
    hp.method5("basanta", 3);
    }
    
}
