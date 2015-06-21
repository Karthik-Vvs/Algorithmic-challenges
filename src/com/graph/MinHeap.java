/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graph;

/**
 *
 * @author suryakarthik.v
 */
public class MinHeap {
    int N;
    int[] pq;
    public MinHeap(int[] arr) {
        N = arr.length;
        pq = new int[N + 1];
        for (int i = 0; i < pq.length - 1; i++) {
            pq[i + 1] = arr[i];
        }
       
    }

   public MinHeap() {
        super();
    }
    public int[] heapify(int[] arr){
         for (int i = N / 2; i >= 1; i--) {            
            sink(i);
        }
         return pq; 
    }

    public void sink(int i) {
        while (2 * i < N) {
            int j = 2 * i;
            if (j < N && less(j+1,j)) {
                j++;
            }
            if (less(i, j)) {
                break;
            } else {
                exch(i, j);
            }
            i=j;
        }
    }
    public void swim(int i){
        while(i>1 && !less(i/2,i)){
            exch(i/2,i);
            i=i/2;
        }       
    }
            

    public int getMin() {
        return pq[1];
    }
    public int deleteMin(){
        int min=pq[1];
        exch(1,N--);
        sink(1);        
        pq[N+1]=(Integer)null;
        return min;
        
    }

    public boolean less(int i, int j){
        return pq[i] < pq[j];
    }

    public void exch(int i,int j) {
        pq[i] = pq[i] + pq[j] - (pq[j] = pq[i]);//a=a+b-(b=a) swaps 2 numbers a,b
    }
}
