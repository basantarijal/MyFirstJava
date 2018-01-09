/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basanta.oop;

import com.basant.test.Tiger;

/**
 *
 * @author Basanta
 */
public class Elephant extends Tiger {
    public Elephant(){
        System.out.println("This is Hatti");
    }
    
    @Override
    public void roar(){
        System.out.println("Elephant dont roar");
    }
    public static void main(String[] args) {
        Elephant ep = new Elephant();
        ep.roar();
        ep.run();
    }
}
