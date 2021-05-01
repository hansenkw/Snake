package Classes;

import Classes.util.Block;
import Classes.util.BlockType;
import Classes.util.Position;
import java.util.Random;


public class Food extends Block {
    public static int GRID_SIZE=15;
    public Food(int x, int y){
        super(BlockType.FOOD, new Position(x,y));
    }

    void generateNewFood(){
        Random randx=new Random();
        Random randy=new Random();
        int upperbound=GRID_SIZE;
        int xnewfood=randx.nextInt(upperbound);
        int ynewfood=randy.nextInt(upperbound);
        this.setPosition(xnewfood, ynewfood);

    }
}
