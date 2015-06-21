/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projecteuler;

/**
 *
 * @author suryakarthik.v
 */
public class Pythagorean1 {
    public static void main(String[] args) {
        int a,b;
        
        for( a=0;a<1000;a++){
            for ( b = 0; b < 1000; b++) {
               int c=1000-a-b;
                if((Math.pow(a, 2)+Math.pow(b,2))==Math.pow(c,2)){
                    System.out.println("abc="+a*b*c);
                }
            }
        }
    }
}
