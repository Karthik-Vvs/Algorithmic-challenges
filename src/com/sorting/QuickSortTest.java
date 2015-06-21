/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

/**
 *
 * @author suryakarthik.v
 */
public class QuickSortTest {
    public static void main(String[] args) {
         Integer[] arr=new Integer[6];
    arr[0]=3;
    arr[1]=1;
    arr[2]=67;
    arr[3]=37;
    arr[4]=2; 
    arr[5]=78;
    QuickSort.sort(arr);
     System.out.println("the sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    
    }
    
}
class QuickSort{
    public static void sort(Comparable[] a){
      
        sort(a,0,a.length-1);
    }
    public static void sort(Comparable[] a,int lo,int hi){
        if(lo>=hi)return;
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
        
    }
    public static int partition(Comparable[] a,int lo,int hi){
        int i=lo,j=hi+1;
        while(true){
            while(less(a[++i],a[lo])){
            if(i==hi)break;
            }
            while(less(a[lo],a[--j])){
                if(j==lo)break;
            }
            if(i>=j)break;
            exch(a,i,j);
        
        }
        exch(a,lo,j);
        return j;
        
    } 
    public static boolean less(Comparable i,Comparable j){
        return i.compareTo(j)<0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }
    
}
