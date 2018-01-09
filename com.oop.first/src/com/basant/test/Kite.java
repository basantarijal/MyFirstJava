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
public class Kite {
    public static void main(String[] args) {
    for (int i = 1; i < 9; i += 2) {
      for (int j = 1; j < 9 - i / 2; j++)
        System.out.print(" ");

      for (int j = 1; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }

    for (int i = 7; i > 1; i -= 2) {
      for (int j = 1; j < 9 - i / 2; j++)
        System.out.print(" ");

      for (int j = 1; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }
  }
}
