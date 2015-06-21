package Default;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryakarthik.v
 */
public class SplitInversions {

    public static void main(String[] args) {
        int[] arr = {56, 3, 5, 4};
        int inv = countInv(arr);
        System.out.println("no of inversions are: " + inv);
    }

    public static int countInv(int[] arr) {
        int N = arr.length;
        int lo = 0;
        int hi = N - 1;
        int[] aux = new int[N];
        int count = countInv(arr, aux, lo, hi);
        return count;
    }

    public static int countInv(int[] arr, int[] aux, int lo, int hi) {
        int count = 0;
        if (hi > lo) {           
            int mid = lo + (hi - lo) / 2;            
            count = countInv(arr, aux, lo, mid);
            count += countInv(arr, aux, mid + 1, hi);
            count += countSplitInv(arr, aux, lo, mid, hi);
        }
        return count;

    }

    public static int countSplitInv(int[] arr, int[] aux, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        int count = 0;
        for (int k = lo; k <= hi; k++) {
            aux[k] = arr[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > hi) {
                arr[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                arr[k] = aux[j++];
                count += mid-i+1;
            } else {
                arr[k] = aux[i];                
                i++;
            }
        }
        return count;
    }
}
