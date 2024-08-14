/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author DELL-PC
 */
public class MathUtil {

    //giai thừa
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20!");
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * getFactorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(MathUtil.getFactorial(5));
    }
    
}
