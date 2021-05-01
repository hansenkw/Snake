package Classes;
import Classes.util.Node;
import Classes.util.Position;
import Classes.util.Queue;
public class Snake {
    Queue snake;
    int length;
    Direction dir;

    enum Direction {
        RIGHT, LEFT, UP, DOWN;
    }

    Snake() {
        this.length = 5;
        this.dir = Direction.RIGHT;
        this.snake = new Queue();
        this.snake.push(new Node(6, 4));
        this.snake.push(new Node(7, 4));
        this.snake.push(new Node(8, 4));
        this.snake.push(new Node(9, 4));
        this.snake.push(new Node(10, 4));
    }

    public int getLength() {
        return length;
    }

    public Direction getDir() {
        return dir;
    }

    public Position getHeadPos() {
        return this.snake.getHead().getPosition();
    }

    public void moveElongate() {
        int xnow = getHeadPos().getX();
        int ynow = getHeadPos().getY();
        switch (this.dir) {
            case RIGHT:
                this.snake.push(new Node(xnow + 1, ynow));
                break;
            case LEFT:
                this.snake.push(new Node(xnow - 1, ynow));
                break;
            case UP:
                this.snake.push(new Node(xnow, ynow + 1));
                break;
            case DOWN:
                this.snake.push(new Node(xnow, ynow - 1));
        }
    }

    public void move(){
        moveElongate();
        this.snake.pop();
    }


////    public void eat(){
////
////    }
////    public void change_dir{
//
//      }
}

