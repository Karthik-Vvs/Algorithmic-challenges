package com.LinkedList;

public class LL<Key> {

    class Node {
        Key data;
        Node next;

        public Node(Key data) {
            this.data = data;
            this.next = null;
        }
    }
    Node first;
    Node last;
    int count = 0;

    public void put(Key data) {
        Node oldfirst = first;
        first = new Node(data);
        if(last==null)last=first;
        first.next = oldfirst;
        count++;
    }

    public void putLast(Key data) {
        Node oldlast = last;
        last = new Node(data);
        oldlast.next = last;
        last.next = null;
        count++;
    }

    public Key getFirst() {
        return first.data;
    }

    public Key delete() {
        Key item = first.data;
        first = first.next;
        count--;
        return item;

    }

    public Key getLast() {
        return last.data;
    }

    public int length() {
        return count;
    }
    public boolean isEmpty(){
        return first==null;
    }
}
