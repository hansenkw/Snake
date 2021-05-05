package Classes;

import Classes.util.Position;

public class Main {
    Grid gamegrid=new Grid();
    public static int GRID_SIZE=15;

    public void main(){
        while(true) {
            gamegrid.snake.move(); //move every time the loop iterates
            if (gamegrid.food.getPosition() == gamegrid.snake.getHeadPos()) {       //if food position == snake head position
                gamegrid.snake.moveElongate();                                      //add 1 block by pushing only
                gamegrid.food.generateNewFood();                                    //create food in random places
            }
            if(gamegrid.snake.getHeadPos().getX()==GRID_SIZE+1 || gamegrid.snake.getHeadPos().getY() ==GRID_SIZE+1          //game over conditions if snake's head exceed grid size
            || gamegrid.snake.getHeadPos().getX()== -1         || gamegrid.snake.getHeadPos().getY() ==-1){
                System.out.println("GAME OVER!!");
                break;
            }

            for(Position pos: gamegrid.snake.queue){                // if snake's head position==one of snake's block position
                if (pos == gamegrid.snake.getHeadPos()){
                    System.out.println("GAME OVER!!");
                    break;
                }
            }
        }

    }

//    //boolean isKenaBadan(){
//        return false;
//    }


}
