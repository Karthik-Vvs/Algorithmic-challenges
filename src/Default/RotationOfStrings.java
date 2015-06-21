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
public class RotationOfStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give a String:");
       
        String str=sc.nextLine();
        System.out.println("String before rotation:"+str);
        String str2=rotate(str,2);
        System.out.println("String after rotation:"+str2);
    }
    public static String rotate(String str,int k){
        int i=0;
        String str1="";
        int n=str.length()-1;
       
            str1=str.substring(n-k+1)+str.substring(0,n-k+1);
           
       
        return str1;
    }
}
