package Default;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryakarthik.v
 */
public class LL {
    static Node first;
    static Node last;
    public static void main(String[] args) {
      insertNode(3);
      insertNode(56);
      insertNode(23);
      insertNode(78);
       System.out.println("The linked list before is:");
        for (Node pass = first; pass!=null; pass=pass.next) {
            System.out.println(pass.data);
        }
        reverseLL();
        System.out.println("The linked list after is:");
        for (Node pass = first; pass!=null; pass=pass.next) {
            System.out.println(pass.data);
        }
    }

   static class Node {

        int data;
        Node next;
    }
   public static void insertNode(int num){
      Node oldlast=last;
      last=new Node();
      last.data=num;
      last.next=null;
      if(first==null)first=last;
      else oldlast.next=last;
      
   }

    public static void reverseLL() {

        Node currentnode = first;
        Node prevnode = null;
        Node nextnode = null;
        while (currentnode != null) {
            nextnode = currentnode.next;
            currentnode.next = prevnode;
            prevnode = currentnode;
            currentnode = nextnode;
        }
       first=prevnode;
    }
}
