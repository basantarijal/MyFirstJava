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
public class NestedWhileLoop {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number for table");
        int number=a.nextInt();
        int i=1;
        while(number<15){
        while(i<=10){
            System.out.println(number+"*"+i+"="+number*i);
            i++;
        }
        System.out.println("\n");
        number++;
        i=1;
    }
}
}