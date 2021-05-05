package Classes.util;

import java.util.Iterator;

public class Queue implements Iterable<Position> {
    Node head;
    Node tail;

    public Queue(){
        this.head=null;
        this.tail=null;
    }
    public void push(Node node){
        if(head==null){
            head=node;
            tail=node;
        }
        else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public Node pop(){
        Node out=tail;
        if(head==null){
            return null;
        }
        if(head.equals(tail)){
            head=null;
            tail=null;
            return out;
        }
        tail.prev.next=null;
        tail=tail.prev;
        out.prev=null;
        return out;
    }
    public Node getHead() {
        return head;
    }

    // code for data structure
    public Iterator<Position> iterator() {
        return new CustomIterator<Position>(this.head);
    }

    private class CustomIterator<Position> implements Iterator<Position>{
        Node curr;
        CustomIterator (Node head) {
            // initialize cursor
            this.curr = head;
        }

        @Override
        public boolean hasNext() {
           return (curr.next!=null);
        }

        @Override
        public Position next() {
            return (Position) curr.next.getPosition();
        }
        //have to check for validity later
    }
}


