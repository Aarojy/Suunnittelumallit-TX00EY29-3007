package Factory_Method;

public abstract class Map {
    static Tile[][] tiles;

    public void setMap(Tile[][] map) {
        tiles = map;
    }

    public abstract Tile createTile();

    public void display() {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
