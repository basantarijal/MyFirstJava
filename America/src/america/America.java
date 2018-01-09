/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package america;

import java.util.Scanner;



/**
 *
 * @author Basanta
 */
public class America {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter length:");
        int length=a.nextInt();
        System.out.println("Enter breadth:");
        int breadth = a.nextInt();
        int i,j,k;
        for(i=length;i>=1;i--){
            
            for(j=breadth;j>=1;j--){
                
                System.out.print("B ");
            }
           System.out.println(); 
        }
        
        }
    }


