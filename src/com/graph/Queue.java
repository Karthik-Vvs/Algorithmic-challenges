/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graph;

/**
 *
 * @author suryakarthik.v
 */
public class Queue {
    class Node {
        int data;
        Node next;

        public Node() {
            super();
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node first;
    Node last;

    public void enque(int data) {
        /*
         * Node oldlast = last; last = new Node(data); if (isEmpty()) { first =
         * last; } else { oldlast.next = last; }
         *
         */
        Node oldlast = last;
        last = new Node();
        last.data = data;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }

    }

    public int deque() {
        int data = first.data;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
