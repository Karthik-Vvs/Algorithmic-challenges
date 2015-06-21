package Default;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryakarthik.v
 */
public class LinkedList1 {

    public static void main(String[] args) {
        LinkedListNew ll = new LinkedListNew();
        ll.insert("Karthik");
        ll.insert("Ravi");
        ll.insert("Raju");
        ll.delete();
        System.out.println(ll.delete());
    }
}

class LinkedListNew {
    private class Node {
        String data;
        Node next;
    }
    public Node first;
    private int N = 0;

    public void insert(String data) {
        Node oldfirst = first;
        first = new Node();
        first.data = data;
        first.next = null;
        first.next = oldfirst;
        N++;
    }

    public String delete() {
        String item = first.data;
        first = first.next;
        N--;
        return item;
    }

    public int count() {
        return N;
    }

    public boolean isEmpty() {
        return (first == null);
    }
}
