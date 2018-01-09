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
public class DayClasswork {
 public static void main(String[] args){
     Scanner a = new Scanner(System.in);
     System.out.println("Enter the number:");
     int number=a.nextInt();
    
if(number ==1){
    System.out.println("The day is Sunday");
}
    else if(number ==2){
    System.out.println("The day is Monday");
}
    else if (number ==3){
    System.out.println("The day is Tuesday");
}
    else if (number ==4){
    System.out.println("The day is Wednesday");
}
    else if (number ==5){
    System.out.println("The day is Thursday");
}
    else if (number ==6){
    System.out.println("The day is Friday");
}
    else if (number ==7){
    System.out.println("The day is Saturday");
}
    else{
        System.out.println("Error");
    }

     }
     
 }   

