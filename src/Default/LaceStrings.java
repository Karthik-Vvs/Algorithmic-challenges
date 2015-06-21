package Default;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryakarthik.v
 */
public class LaceStrings {
    public static void main(String[] args) {
        String a="abcdi",b="efghkil";
        String lace=lace(a,b);
        System.out.println(lace);
    }
    public static String lace(String str1,String str2){
        int n1=str1.length();
        int n2=str2.length();
        String str="";
        for (int i = 0; i <min(n1,n2); i++) {
            str+=str1.substring(i,i+1)+str2.substring(i,i+1);
        }
        if(n1<n2)str+=str2.substring(n1);
        else if(n1>n2)str+=str1.substring(n2);
        return str;
    }
    public static int min(int n1,int n2){
        if(n1<=n2) return n1;
        else return n2;
    }
}
