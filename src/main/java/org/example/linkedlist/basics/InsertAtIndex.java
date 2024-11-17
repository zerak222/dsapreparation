package org.example.linkedlist.basics;

import org.example.linkedlist.LinkedListUtil;
import org.example.linkedlist.Node;

public class InsertAtIndex {
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
        System.out.println("Initial List:");
        LinkedListUtil.printLinkedList(n1);

        // insert node 6 as value at index 3
        add(n1,6,3);
        System.out.println("List After modification:");
        LinkedListUtil.printLinkedList((n1));



    }
    public static Node add(Node aNode,int aData,int aIndex){
        Node nn = new Node(aData);

        if(aIndex==0){
            nn.next = aNode;
            aNode = nn;
        }else{
            Node temp = aNode;
            for(int i=1;i<aIndex-1;i++){
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
        }
        return aNode;
    }
}
