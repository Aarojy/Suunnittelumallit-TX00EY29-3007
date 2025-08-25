package Factory_Method.maps;

import Factory_Method.Map;
import Factory_Method.Tile;
import Factory_Method.tiles.*;

public class WildernessMap extends Map {
    Tile[] tiles = {new Swamp(), new Water(), new Forest()};

    @Override
    public Tile createTile() {
        int randInt = (int)(Math.random()*tiles.length);

        return tiles[randInt];
    }
}
