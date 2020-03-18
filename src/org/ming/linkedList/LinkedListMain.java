package org.ming.linkedList;

import org.ming.linkedList.SingleLinkedList;

public class LinkedListMain {

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
//        linkedList.insertFromTail(linkedList,7);
//        linkedList.insertFromTail(linkedList,6);
//        linkedList.insertFromTail(linkedList,5);
//        linkedList.insertFromTail(linkedList,4);
//        linkedList.insertFromTail(linkedList,3);

        linkedList.insertFromHead(linkedList,7);
        linkedList.insertFromHead(linkedList,6);
        linkedList.insertFromHead(linkedList,5);
        linkedList.insertFromHead(linkedList,4);
        linkedList.insertFromHead(linkedList,3);

        linkedList.printSingleLinkedList(linkedList);

    }
}
