import java.util.ArrayList;

public class Cell {
    private ArrayList<Object> cell;

    public Cell() {
        this.cell = new ArrayList<>();
    }

    public ArrayList<Object> getCell() {
        return cell;
    }

    public void setCell(ArrayList<Object> cell) {
        this.cell = cell;
    }
}
