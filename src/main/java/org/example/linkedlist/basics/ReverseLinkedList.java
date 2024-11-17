package org.example.linkedlist.basics;

import org.example.linkedlist.LinkedListUtil;
import org.example.linkedlist.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println("Original LinkedList:");
        LinkedListUtil.printLinkedList(n1);
        System.out.println("Reversed LinkedList:");
        LinkedListUtil.printLinkedList(reverseLinkedList(n1));
    }

    private static Node reverseLinkedList(Node aNode) {
        if(aNode==null){
            return aNode;
        }
        Node prev = null;
        Node curr = aNode;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
