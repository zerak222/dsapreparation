package org.example.linkedlist.advanced;

import org.example.linkedlist.LinkedListUtil;
import org.example.linkedlist.Node;

public class MergeSortedLinkedLists {
    public static void main(String[] args) {
        Node n2 = new Node(2);
        Node n4 = new Node(4);
        Node n6 = new Node(6);
        Node n8 = new Node(8);
        n2.next = n4;
        n4.next = n6;
        n6.next = n8;

        Node n1 = new Node(1);
        Node n3 = new Node(3);
        Node n5 = new Node(5);
        Node n7 = new Node(7);
        n1.next = n3;
        n3.next = n5;
        n5.next = n7;

        LinkedListUtil.printLinkedList(n1);
        LinkedListUtil.printLinkedList(n2);

        Node n = mergeSortedList(n1,n2);
        LinkedListUtil.printLinkedList(n);
    }

    private static Node mergeSortedList(Node n1, Node n2) {
        Node dummy = new Node(-1);
        Node t1 = n1;
        Node t2 = n2;
        Node temp = dummy;
        while(t1!=null && t2!=null){
            if(t1.value <t2.value){
                temp.next = t1;
                temp=t1;
                t1=t1.next;
            }else{
                temp.next = t2;
                temp = t2;
                t2=t2.next;
            }
        }
        if(t1!=null){
            temp.next = t1;
        }
        if(t2!=null){
            temp.next = t2;
        }

        return dummy.next;
    }
}
