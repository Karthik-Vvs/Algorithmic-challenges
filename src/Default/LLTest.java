package Default;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryakarthik.v
 */
public class LLTest {
    Node head;
    public class Node{
        int data;
        Node next;
    }
    public void llshift(Node head){
        for (Node i=head;i!= null; i=i.next) {
            if(i.data==1)putlast(i);
        }
    }
    public void put(Node x){
        Node oldhead=head;
        head=new Node();
        head.next=oldhead;        
    }
    public void putlast(Node x){      
       Node last=head;       
       for(Node i=head;i!=null;i=i.next){
           last=last.next;
       }       
       last.next=x;
    }
}

