package org.example.linkedlist;

public class LinkedListUtil {
    public static void printLinkedList(Node aNode){
        Node temp = aNode;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println();
    }


}
