public class Island {
    private int height;
    private int width;
    private Cell[][] island;

    public Island(int height, int width) {
       this.island = new Cell[height][width];
        for (int i = 0; i <height ; i++) {
            for (int j = 0; j < width; j++) {
                island[i][j] = new Cell();
                island[i][j].setCellPositionHeight(i);
                island[i][j].setCellPositionWidth(j);
            }
        }
    }

}
