package org.example.linkedlist.basics;

import org.example.linkedlist.Node;

public class MiddleOfNode {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;


        // using fast pointer and slow pointer technique
        Node middleNode = findMiddleNode(n1);
        System.out.println("Middle Node: "+middleNode.value);
    }
    public static Node findMiddleNode(Node aNode){
        Node fast = aNode;
        Node slow = aNode;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            if(fast!=null && fast.next!=null){
                slow = slow.next;
            }
        }
        return slow;
    }
}
