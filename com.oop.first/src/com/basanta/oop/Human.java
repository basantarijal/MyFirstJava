/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basanta.oop;

/**
 *
 * @author Basanta
 */
public class Human implements Man,Woman{

    @Override
    public void ram() {
        System.out.println("Hello Ram");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sita() {
        System.out.println("Hello Sita");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        Human hm = new Human();
        hm.ram();
        hm.sita();
        
    }
}
