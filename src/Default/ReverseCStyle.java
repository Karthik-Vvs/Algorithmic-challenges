package Default;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryakarthik.v
 */
public class ReverseCStyle {
    public static void main(String[] args) {
        char[] ch={'a','b','c','\0'};
        char[] rev=reverse(ch);
        System.out.println(rev);
    }
    public static char[] reverse(char[] ch){
        int n=ch.length;
        for (int i = 0; i <n-2 ; i++) {
            swap(ch,i,n-i-2);
        }
        return ch;
    }
    public static void swap(char[] ch,int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    
}
