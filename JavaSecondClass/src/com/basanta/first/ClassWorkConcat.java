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
public class ClassWorkConcat {
    public static void main(String[] args){
        String name="Ram";
        String city="KTM";
        int id=10;
        String country="Nepal";
        String sql="INSERT INTO student(name,city)VALUES ("+"'"+name+"',"+"'"+city+"'"+")";
        System.out.println(sql);
        String sql1="INSERT INTO student(id,name,city,country)VALUES ("+id+",'"+name+"','"+city+"','"+country+"'"+")";
        System.out.println(sql1);
        String sql2= "UPDATE student set name= '"+name+"' "+"WHERE id="+id;
        System.out.println(sql2);
        
    }
}
