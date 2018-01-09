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
public class GetSetGo {
    public static void main(String[] args) {
        GetSet sn = new GetSet();
        sn.Sname("Basanta");
        System.out.println("Your name is "+ sn.Gname());
        sn.Sage(25);
        System.out.println("Your age is "+ sn.Gage());
        sn.Saddress("Kathmandu");
        System.out.println("You are from "+ sn.Gaddress());
        
    }
}
