/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projecteuler;

import java.math.BigInteger;

/**
 *
 * @author suryakarthik.v
 */
public class NFactorial {
    public static void main(String[] args) {
        int sum=0;
        BigInteger value=factorial(100);
        while(value.compareTo(BigInteger.valueOf(0))>0){
         BigInteger b=value.remainder(BigInteger.valueOf(10));
            sum+=b.intValue();
            value=value.divide(BigInteger.valueOf(10));
        }
        System.out.println(sum);
    }

    public static BigInteger factorial(int n) {
       BigInteger fact;
        if (n == 0 || n == 1) return BigInteger.valueOf(1);
        else fact =BigInteger.valueOf(n).multiply(factorial(n - 1)) ;
        return fact;
    }
}
