/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.first;

import java.util.Scanner;

/**
 *
 * @author Basanta
 */
public class GetSet {
    private String name, address;
    private int age;
    //private String address;
    
    Scanner sc = new Scanner(System.in);
    
    public void Sname(String name){
        
        System.out.println("Enter your name:");
        this.name = sc.nextLine();
        
    }
    public String Gname(){
        return name; 
          
    }
    public void Sage(int age){
        
        System.out.println(this.name +" enter your age:");
        this.age=sc.nextInt();
    }
    public int Gage(){
        return age;
        
    }
    public void Saddress(String address){
        
        System.out.println(this.name +" your age is "+this.age+" and you are from?");
         
        this.address = sc.nextLine();
        this.address = sc.nextLine();
    }
    public String Gaddress(){
        return address;
        
    }
}
