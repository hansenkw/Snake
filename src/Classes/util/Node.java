package Classes.util;

public class Node extends Block {
    Node next;
    Node prev;

    public Node(int x,int y){
        super(BlockType.SNAKE, new Position(x,y));
        this.next=null;
        this.prev=null;
    }

    public Node(Position position){
        super(BlockType.SNAKE, position);
        this.next=null;
        this.prev=null;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }
}


