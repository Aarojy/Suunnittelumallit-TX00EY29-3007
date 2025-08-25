package Factory_Method.tiles;
import Factory_Method.Tile;

public class Water implements Tile {
    @Override
    public char getCharacter() {
        return 'W';
    }
    @Override
    public String getType() {
        return "Water";
    }
    @Override
    public void action() {
    }
}
