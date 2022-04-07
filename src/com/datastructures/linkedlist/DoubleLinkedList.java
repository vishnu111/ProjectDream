package com.datastructures.linkedlist;

public class DoubleLinkedList {
    private DoubleLinkedListNode head;
    private DoubleLinkedListNode tail;
    private int size;
    public void addAtHead(Colours c){
        DoubleLinkedListNode dl = new DoubleLinkedListNode(c);
        if(head==null){
            tail=dl;
        }
        else{
            head.setPrevious(dl);
            dl.setNext(head);
        }
        head=dl;
        size++;
    }
    public void printList(){
        DoubleLinkedListNode current=head;
        while(current != null){
            System.out.print("=>");
            System.out.print(current);
            current = current.getNext();
        }

    }
}
