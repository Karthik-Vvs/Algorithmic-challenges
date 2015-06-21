/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Default;

import java.util.Scanner;

/**
 *
 * @author suryakarthik.v
 */
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give the string");
        String str=sc.nextLine();
        System.out.println("the given string is "+str);
        System.out.println("give the index to rotate the string:");
        int k=sc.nextInt();
        CaesarCipher cc=new CaesarCipher();
        String cipher=cc.encrypt(str,k);
        System.out.println("the encrypted string is "+cipher);
        
    }
    public String encrypt(String str,int k){
       // String cip=str.substring(k)+str.substring(0,k);
        //return cip;
        int n=str.length();
        String enc="";
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            enc+=encryptChar(ch,k,n);
        }
        return enc;
    }
    public char encryptChar(char ch,int k,int n){
        return (char)('a'+(ch-'a'+k)%n);
    }
}
