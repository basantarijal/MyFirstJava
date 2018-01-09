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
public class TwoDArray {
    public static void main(String args []){
        int[][] arrNum = new int[3][3];//first[] =row and =column ani row khali hunu hunna
        arrNum[0][0] = 1;
        arrNum[0][1] = 2;
        arrNum[0][2] = 3;
        
        arrNum[1][0] = 4;
        arrNum[1][1] = 5;
        arrNum[1][2] = 6;
       
        arrNum[2][0] = 7;
        arrNum[2][1] = 8;
        arrNum[2][2] = 9;
        
        int i,j;
        int row=3;
        int column=3;
        
        for (i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print(arrNum[i][j]+" ");
                
            }
            System.out.println("");
                    
        }
    }
}
