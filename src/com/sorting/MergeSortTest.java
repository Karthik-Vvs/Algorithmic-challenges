/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

/**
 *
 * @author suryakarthik.v
 */
public class MergeSortTest {

    public static void main(String[] args) {
        Rectangle[] rect = new Rectangle[4];
        rect[0] = new Rectangle(34.5, 44.6);
        rect[1] = new Rectangle(54.5, 46.6);
        rect[2] = new Rectangle(38.5, 64.6);
        rect[3] = new Rectangle(24.5, 84.6);
        MergeSort.sort(rect);
        System.out.println("The sorted values are");
        for (int i = 0; i < rect.length; i++) {
            System.out.println("rect[" + i + "] is (" + rect[i].x + "," + rect[i].y + ")");
        }
    }
}

class MergeSort {

    public static final int CUTOFF = 7;

    public static void sort(Comparable[] a) {

        int N = a.length;
        Comparable[] aux = new Comparable[N];
        sort(a, aux, 0, N - 1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi - lo < CUTOFF) {
            InsertionSort.sort(a);
            return;
        }
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);

    }

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
