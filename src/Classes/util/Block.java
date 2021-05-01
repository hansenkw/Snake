package Classes.util;

import Classes.util.BlockType;
import Classes.util.Position;

public abstract class Block {
    Position position;
    BlockType type;

    protected Block(BlockType type, Position pos){
        this.type = type;
        this.position = pos;
    }

    public Position getPosition() {
        return position;
    }

    public BlockType getType() {
        return type;
    }

    protected void setPosition(Position pos){
        this.position = pos;
    }

    protected void setPosition(int x, int y){
        this.position = new Position(x,y);
    }
}
