package Factory_Method.maps;

import Factory_Method.Map;
import Factory_Method.Tile;
import Factory_Method.tiles.Building;
import Factory_Method.tiles.Forest;
import Factory_Method.tiles.Road;

public class CityMap extends Map {
    Tile[] tiles = {new Building(), new Road(), new Forest()};

    @Override
    public Tile createTile() {
        int randInt = (int)(Math.random()*tiles.length);

        return tiles[randInt];
    }
}
