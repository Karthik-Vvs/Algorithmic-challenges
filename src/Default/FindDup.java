package Default;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryakarthik.v
 */
public class FindDup {//to do

    public static void main(String[] args) {
        String str="abcdabcdef";
        System.out.println(hasNoDuplicates(str));
        removeDup(str);
        System.out.println(str);
    }

    public static boolean hasNoDuplicates(String str) {
        boolean[] id = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int k = str.charAt(i);
            if (id[k]) {
                return false;
            }
            id[k] = true;
        }
        return true;
    }

    public static String removeDup(String str) {
        String str1=str;
        if (hasNoDuplicates(str)) {
            return str;
        } else {
            boolean[] id = new boolean[256];
            for (int i = 0; i < str.length(); i++) {
                int k = str.charAt(i);
                if (id[k]){
                    str1+=str.replace(str.charAt(i),'\0');
                }
                id[k] = true;
            }
            return str1;
        }
    }
}
