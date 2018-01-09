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
public class AreaCalc {
        int length,breadth,area;
        
    
    public int RectangleArea(){
        System.out.println("Area calculation of rectangle");
        area = length*breadth;
        return area;
    }
    public void SquareArea(){
        System.out.println("Area calculation of square");
        area = length*length;
        
    }
    public static void main(String[] args) {
        AreaCalc ab = new AreaCalc();
        System.out.println("");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length:");
        int length = sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth = sc.nextInt();
        System.out.println("The area of rectangle is:"+ab.RectangleArea());
        
        
//        System.out.println("Enter length:");
//        length = sc.nextInt();
//        System.out.println("The area of square is:"+area);
//        
        
        
    }
}

