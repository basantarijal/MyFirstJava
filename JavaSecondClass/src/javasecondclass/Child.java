/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasecondclass;

import com.basanta.first.Parent;

/**
 *
 * @author Basanta
 */
public class Child extends Parent{
    
    @Override
    public void m1(){
        System.out.println("Hi");
    } 
    public static void main(String[] args) {
        Child in = new Child();
        in.m1();
        //in.m2(); private access garna mildaina(Inheritance)
        in.m3();
        
    }
}
