package Factory_Method.tiles;

import Factory_Method.Tile;

public class Swamp implements Tile {
    @Override
    public char getCharacter() {
        return 'S';
    }
    @Override
    public String getType() {
        return "Swamp";
    }
    @Override
    public void action() {
    }
}
