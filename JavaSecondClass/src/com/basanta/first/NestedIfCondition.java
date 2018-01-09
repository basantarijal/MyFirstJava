/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basanta.first;

import java.util.Scanner;

/**
 *
 * @author Basanta
 */
public class NestedIfCondition {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a:");
        a=obj.nextInt();
        System.out.println("Enter the value of b:");
        b=obj.nextInt();
        System.out.println("Enter the value of c:");
        c=obj.nextInt();
        if(a>b){
            if(a>c){
               System.out.println("Greater vamue is "+a);
            }
            else{
                System.out.println("greater value is "+c);
            }
            }
        else{
            if(b>c){
                System.out.println("greater value is "+b);
            }
            else{
                System.out.println("greater value is "+c);
            }
        }
    }
}
