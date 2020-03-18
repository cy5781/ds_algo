package org.ming.linkedList;

public class SingleLinkedList {

    Node head;

    //insert data from tail
    public static SingleLinkedList insertFromTail(SingleLinkedList linkedList, int nodeData) {

        Node newNode = new Node(nodeData);
        newNode.next = null;

        // the linked list is empty
        if (linkedList.head == null) {
            linkedList.head = newNode;
        }
        // find the last node and add data in the tail
        else {
            Node lastNode = linkedList.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        return linkedList;
    }

    //insert data from head
    public static SingleLinkedList insertFromHead(SingleLinkedList linkedList, int nodeData) {

        Node newNode = new Node(nodeData);
        newNode.next = null;

        // the linked list is empty
        if (linkedList.head != null) {
            newNode.next = linkedList.head;
        }
        linkedList.head = newNode;

        return linkedList;
    }

    public static void deleteNode(int nodeData){
        //condition 1 is head node
        //condition 2 middle
        //condition 3 tail node
    }

    public static void printSingleLinkedList(SingleLinkedList list) {
        System.out.println("My singleLinked List is :");
        if (list != null) {
            Node currentNode = list.head;
            while (currentNode != null) {
                System.out.print(" " + currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }


}

class Node {
    public int data;
    public Node next;

    public Node(int inData) {
        data = inData;
        next = null;
    }
}
