package Classes;

public class Main {
    Grid gamegrid=new Grid();
    public static int GRID_SIZE=15;

    public void main(){
        while(true) {
            gamegrid.snake.move();
            if (gamegrid.food.getPosition() == gamegrid.snake.getHeadPos()) {
                gamegrid.snake.moveElongate();
                gamegrid.food.generateNewFood();
            }
            if(gamegrid.snake.getHeadPos().getX()==GRID_SIZE+1 || gamegrid.snake.getHeadPos().getY()==GRID_SIZE+1 || ){
                break;
            }
        }





    }


}
