package Default;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryakarthik.v
 */
public class EpicAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b);
        System.out.println("the sum is "+sum);
    }
    public static int add(int a,int b){
        int sum,carry;
        if(b==0){
            return a;
        }
        sum=a^b;
        carry=a&b;
        carry=carry<<1;
        return add(sum,carry);
    }
}
