package gamecode;

public class Map
{

    private Tile[][] tiles = null;
    private int width;
    private int height;

    public Map(int width,int height){
        this.tiles = new Tile[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                    tiles[x][y] = new Tile(Type.GRASS);
                //System.out.println("testmapcreate");
                }
            }
        }

    public Tile[][] getTiles(){
        return tiles;
    }
    public Tile getTile(int x, int y){
        //System.out.println(tiles.length + " " + tiles[0].length);
        boolean rightcon = ((0 <= x) && (x<= tiles.length));
        boolean leftcon = ((0 <=x) && (x<= tiles[0].length));
        if (leftcon && rightcon) {
            return tiles[x][y];
        } else {
            // Handle the case when the coordinates are out of bounds
            // You can throw an exception, return a default tile, or handle it based on your requirements
            return null; // Return null as an example
        }
    }
    public void setTile(int x, int y, Tile tile){
        tiles[x][y] = tile;
    }

    public int[] getCord(Tile tile) {
        for (int x = 0; x < tiles.length; x++) {
            for (int y = 0; y < tiles[x].length; y++) {
                if (tiles[x][y].equals(tile)) {
                    int realX = x ;
                    int realY = y ;
                    return new int[]{realX, realY};
                }
            }
        }
        return null; // gamecode.Tile not found
    }
}


