package Default;


class LinkedStack {
    private int N;
    public Node first;
    
    class Node {

        String item;
        Node next;
    }

    public void push(String item) {
        Node second = first;
        first = new Node();
        first.item = item;
        first.next = second;
        N++;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        N--;
        return item;

    }

    public int count() {
        return N;
    }
}

public class LinkedStackTest {

    public static void main(String[] args) {
        LinkedStack ls = new LinkedStack();
        ls.push("Karthik");
        ls.push("ravi");
        System.out.println(ls.pop());
        System.out.println(ls.count());
    }
}