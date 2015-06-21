package Default;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryakarthik.v
 */
public class ReverseString {
    public static void main(String[] args) {
        String str="naveen";
        String rev="";
            for (int i = 0; i <str.length(); i++) {
            rev=str.substring(i,i+1)+rev;
        }
            System.out.println(rev);
    }
}
