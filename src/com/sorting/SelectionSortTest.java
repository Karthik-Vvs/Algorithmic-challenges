/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

/**
 *
 * @author suryakarthik.v
 */
public class SelectionSortTest {

    public static void main(String[] args) {
        String[] str = new String[10];
        str[0] = "H";
        str[1] = "R";
        str[2] = "I";
        str[3] = "Q";
        str[4] = "U";
        str[5] = "V";
        str[6] = "W";
        str[7] = "G";
        str[8] = "C";
        str[9] = "X";


        SelectionSort.sort(str);
        System.out.println("The sorted values are");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}

class Rectangle implements Comparable {

    double x, y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object b) {
        Rectangle r = (Rectangle) b;
        if (this.x > r.x) {
            return 1;
        } else if (this.x == r.x) {
            return 0;
        } else {
            return -1;
        }
    }
}

class SelectionSort {

    public static void sort(Comparable[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
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