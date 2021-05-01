package Classes;

import Classes.util.Block;

public class Grid {
    Snake snake;
    Food food;
    Block[][] grid;
    public static int GRID_SIZE=15;

    Grid(){
        this.snake=new Snake();
        this.food=new Food(3,4);
        this.grid = new Block[GRID_SIZE][GRID_SIZE];

    }

    public Snake getSnake() {
        return snake;
    }

    public Food getFood() {
        return food;
    }
}
