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
public class GetterSetter {//get garni ra set garni==incapsualtion
    private int id;
    private String name;
    private String address;
    
    public void setId(int id){
        this.id= id;
        
    }
    public int getId(){
        return id;
        
    }
    public void setName(String name){
        this.name = name;
        
    }
    public String getName(){
        return name;
        
    }
    public void setAddress(String address){
        this.address= address;
        
    }
    public String getAddress(){
        return address;
        
    }
           
}
