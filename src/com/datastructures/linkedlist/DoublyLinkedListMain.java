package com.datastructures.linkedlist;
public class DoublyLinkedListMain {
    public static void main(String[] args) {
      Colours r= new Colours("red");
      Colours g= new Colours("green");
      Colours b= new Colours("blue");
       DoubleLinkedList dl= new DoubleLinkedList();
       dl.addAtHead(r);
        dl.addAtHead(g);
        dl.addAtHead(b);
        dl.printList();
    }
}
