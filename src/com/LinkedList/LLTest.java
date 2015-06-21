/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LinkedList;

import com.LinkedList.LL.Node;

/**
 *
 * @author suryakarthik.v
 */
public class LLTest {

    public static void main(String[] args) {
        LL<Integer> ll = new LL<Integer>();
        ll.put(6);
        ll.put(5);
        ll.put(3);
        ll.put(1);
        Node num = ll.new Node(2);
        sortedInsert(ll, num);
        System.out.println("list first is: " + ll.first.data);
        System.out.println("list last is: " + ll.last.data);

        for (Node i = ll.first; i != null; i = i.next) {
            System.out.println(i.data);

        }

    }

    public static boolean isEmpty(LL list) {
        return list.first == null;
    }

    public static int findDup(Node first, int data) {
        int count = 0;
        for (Node i = first; i != null; i = i.next) {
            if (i.data == data) {
                count++;
            }
        }
        return count;
    }

    public static int getNth(LL<Integer> list, int index) {
        int count = 0;
        Node i;
        for (i = list.first; i != null; i = i.next) {
            if (count == index) {
                return (int) i.data;
            }
            count++;
        }
        return (int) i.data;


    }

    public static void deleteList(LL list) {
        while (list.first != null) {
            list.first = list.first.next;
        }

    }

    public static void insertNth(LL list, int index, int data) { //to do
        int count = 0;
        Node i;
        Node lat = list.new Node(data);
        if (index == 0) {
            lat.next = list.first;
            list.first = lat;
        } else {
            for (i = list.first; i != null; i = i.next) {
                if (count == index - 1) {
                    lat.next = i.next;
                    i.next = lat;
                }
                count++;
            }
        }
    }

    public static void sortedInsert(LL sortedList, Node newnode) {
        int count = 0;
        if ((int) newnode.data > (int) sortedList.last.data) {
        }
        for (Node i = sortedList.first; i != null; i = i.next, count++) {
            if ((int) i.data < (int) newnode.data && (int) i.next.data > (int) newnode.data) {
                insertNth(sortedList, count + 1, (int) newnode.data);
            }
        }
    }
}
