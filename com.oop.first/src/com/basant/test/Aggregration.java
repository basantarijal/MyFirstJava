/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basant.test;
import com.oop.first.TestAggregation;
/**
 *
 * @author Basanta
 */
import com.oop.first.TestAggregation;
public class Aggregration {
    String name;
    String surname;
    TestAggregation ta;
    
    public Aggregration(String name,String surname, TestAggregation ta){
        this. name = name;
        this.surname = surname;
        this.ta = ta;
        
        
        
    }
    public void ag1(){
        System.out.println(name+" "+surname+" "+ta.city+" "+ta.country);
    }
    public static void main(String[] args) {
        TestAggregation ta1 = new TestAggregation("Ktm","Nepal");
        Aggregration agg = new Aggregration ("basanta","rijal",ta1);
        agg.ag1();
    }
}
