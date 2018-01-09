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
public class Area {
    
    private int length, breadth,area;
    
       Scanner sc = new Scanner(System.in);
    
    public void SetLength(int length){
        
        
        this.length = sc.nextInt();
        
    }
    public int GetLength(){
        return length; 
          
    }
    public void SetBreadth(int breadth){
        
        
        this.breadth=sc.nextInt();
    }
    public int GetBreadth(){
        return breadth;
        
    }
    public void SetArea(int area){
         area = length*breadth;
        
    }
    public int GetArea(){
        return area;
        
    }
        
    }



