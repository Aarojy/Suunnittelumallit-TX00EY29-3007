package Factory_Method;

import Factory_Method.maps.*;

public class Game {
    static int MapSize = 5;

    public static void main(String[] args) {
        Map GameMap = new CityMap();

        createMap(GameMap);

        GameMap.display();
    }

    public static void createMap(Map map) {
        Tile[][] tiles = new Tile[MapSize][MapSize];

        for (int i = 0; i < MapSize; i++) {
            for (int j = 0; j < MapSize; j++) {
                tiles[i][j] = map.createTile();
            }
        }
        map.setMap(tiles);
    }
}
