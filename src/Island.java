public class Island {
    private int height;
    private int width;
    private Cell[][] island;

    public Island(int height, int width) {
        this.height = height;
        this.width = width;
       this.island = new Cell[height][width];
        for (int i = 0; i <height ; i++) {
            for (int j = 0; j < width; j++) {
                island[i][j] = new Cell();
                island[i][j].setCellPositionHeight(i);
                island[i][j].setCellPositionWidth(j);
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Cell getCell(int x,int y){
        return island[x][y];
    }
}
