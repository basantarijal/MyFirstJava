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
public class GetterSetterTest {
    public static void main(String[] args) {
        GetterSetter gs = new GetterSetter();
        gs.setId(40);
        System.out.println(gs.getId());
        gs.setName("Basanta");
        System.out.println(gs.getName());
        gs.setAddress("Kathmandu");
        System.out.println(gs.getAddress());
        
//        GetterSetter gsd = new GetterSetter();
//        System.out.println(gsd.getId());
//        System.out.println(gsd.getName());
//        System.out.println(gsd.getAddress());
    }
}
