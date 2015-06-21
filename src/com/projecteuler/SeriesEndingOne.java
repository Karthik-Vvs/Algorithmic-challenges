/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projecteuler;

/**
 *
 * @author suryakarthik.v
 */
public class SeriesEndingOne {
    public static final int N=1000000;
    public static void main(String[] args) {
        
        int[] count=new int[N];
        int j=0;
        for (int i = 2; i < N; i++) {
            while(i>1 && j<count.length){
                if(iseven(i)){
                    i=i/2;
                }
                else {
                    i=3*i+1;
                }
                count[j]++;
                j++;
            }
        }
        int i_for_maxcount=max(count);
        System.out.println("the number for which the sequence is longest is "+i_for_maxcount);
        
    }
    public static boolean iseven(int i){
        return i%2==0;
    }
    public static int max(int[] count){
        int j=0,max=count[0];
        for ( j = 0; j < count.length; j++) {
            if(count[j]>max)max=count[j];
        }
        return j;
    }
}
