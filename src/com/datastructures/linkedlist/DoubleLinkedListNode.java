package com.datastructures.linkedlist;

public class DoubleLinkedListNode {
    private Colours c;
    private DoubleLinkedListNode previous;
    private DoubleLinkedListNode next;

    public DoubleLinkedListNode(Colours c) {
        this.c=c;
    }
    public Colours getC() {
        return c;
    }

    public void setC(Colours c) {
        this.c = c;
    }

    public DoubleLinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLinkedListNode previous) {
        this.previous = previous;
    }

    public DoubleLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedListNode next) {
        this.next = next;
    }
   public String toString(){
        return c.toString();
   }

}
