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
public class SimpleCalc {
    
    static float a,b,c,sum,result;
    public float sum(){
        sum = a+b+c;
        return sum;
    }
        public float result(){
        result = sum/2;
        return result;           
    }
        
        public static void main(String[] args) {
        SimpleCalc cal= new SimpleCalc();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a=");
        a= sc.nextFloat();
        System.out.println("Enter b=");
        b=sc.nextFloat();
        System.out.println("Enter c=");
        c=sc.nextFloat();
        
            System.out.println("The sum is "+cal.sum() );
            System.out.println("The result is "+cal.result());
        
    }
}