/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

/**
 *
 * @author suryakarthik.v
 */
public class InsertionSortTest {

    public static void main(String[] args) {
        Rectangle[] rect = new Rectangle[4];
        rect[0] = new Rectangle(34.5, 44.6);
        rect[1] = new Rectangle(54.5, 46.6);
        rect[2] = new Rectangle(38.5, 64.6);
        rect[3] = new Rectangle(24.5, 84.6);
        InsertionSort.sort(rect);
        System.out.println("The sorted values are");
        for (int i = 0; i < rect.length; i++) {
            System.out.println("rect[" + i + "] is (" + rect[i].x + "," + rect[i].y + ")");
        }
    }
}

class InsertionSort {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                }
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
