package org.example.linkedlist.advanced;

import org.example.linkedlist.LinkedListUtil;
import org.example.linkedlist.Node;
/*
    I/p: 1->2->3->4->5->6
    O/p: 1->6->2->5->3->4

    1)split into two equal halves
    2) 1->2->3
       4->5->6
    3) Reverse second list
        1->2->3
        6->5->4
    4) Merge two lists
        1->6->2->5->3->4

 */
public class ReorderLinkedList {
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
        System.out.println("Original List:");
        LinkedListUtil.printLinkedList(n1);

        // Find the middle of the list
        Node fast = n1;
        Node slow = n1;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            if(fast!=null && fast.next!=null){
                slow = slow.next;
            }
        }
        Node t1 = n1;
        Node t2 = slow.next;
        // split into t1 and t2
        slow.next = null;
        LinkedListUtil.printLinkedList(t1);
        // reverse t2
        t2=reverseList(t2);
        LinkedListUtil.printLinkedList(t2);
        // merge t1 and t2
        Node t = mergeLists(t1,t2);
        System.out.println("ReOrdered List");
        LinkedListUtil.printLinkedList(t);

    }

    private static Node mergeLists(Node aNode1, Node aNode2) {

        Node nn = new Node(-1);
        Node t1 = aNode1;
        Node t2 = aNode2;
        Node temp = nn;
        while(t1!=null && t2!=null){
            temp.next = t1;
            temp = t1;
            t1 = t1.next;
            // move to t2
            temp.next = t2;
            temp = t2;
            t2 = t2.next;
        }
        if(t1!=null){
            temp.next = t1;
        }
        if(t2!=null){
            temp.next = t2;
        }

        return nn.next;

    }

    public static Node reverseList(Node aNode){
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
