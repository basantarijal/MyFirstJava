/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basant.test;

/**
 *
 * @author Basanta
 */
public class Pattern {
    public static void main(String[] args) {
        int i;
        int j;
        for ( i = 1; i <= 6; i++) {
        for ( j = 1; j <= i; j++) {
        System.out.print("#");
        }
        System.out.println();
        }
    }
}