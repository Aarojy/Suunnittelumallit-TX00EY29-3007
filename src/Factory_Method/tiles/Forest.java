package Factory_Method.tiles;

import Factory_Method.Tile;

public class Forest implements Tile {
    @Override
    public char getCharacter() {
        return 'F';
    }
    @Override
    public String getType() {
        return "Forest";
    }
    @Override
    public void action() {
    }
}

