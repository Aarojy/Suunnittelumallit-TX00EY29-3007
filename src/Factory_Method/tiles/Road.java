package Factory_Method.tiles;

import Factory_Method.Tile;

public class Road implements Tile {
    @Override
    public char getCharacter() {
        return 'R';
    }
    @Override
    public String getType() {
        return "Road";
    }
    @Override
    public void action() {
    }
}

