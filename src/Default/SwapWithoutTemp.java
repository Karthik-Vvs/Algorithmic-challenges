package Default;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryakarthik.v
 */
public class SwapWithoutTemp {

    public static void main(String[] args) {
        int a = 2, b = 3;
        swap1(a, b);
        swap2(a, b);
        swap3(a, b);

    }

    public static void swap1(int a, int b) {
        a = a + b - (b = a);
        System.out.println("swap1 :a=" + a + " b=" + b);
    }
     public static void swap2(int a, int b) {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swap 2:a=" + a + " b=" + b);
    }
      public static void swap3(int a, int b) {
        a^=b;
        b^=a;
        a^=b;
        System.out.println("swap 3: a=" + a + " b=" + b);
    }
}
