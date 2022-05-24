import java.util.ArrayList;

public class Cell {
    private ArrayList<Animal> animalList;
    private ArrayList<Plants> plantsList;
    private int cellPositionHeight = -1;
    private int cellPositionWidth = -1;

    public Cell() {
        this.animalList = new ArrayList<>();
        this.plantsList = new ArrayList<>();
    }

    public int getCellPositionHeight() {
        return cellPositionHeight;
    }

    public void setCellPositionHeight(int cellPositionHeight) {
        this.cellPositionHeight = cellPositionHeight;
    }

    public int getCellPositionWidth() {
        return cellPositionWidth;
    }

    public void setCellPositionWidth(int cellPositionWidth) {
        this.cellPositionWidth = cellPositionWidth;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    public ArrayList<Plants> getPlantsList() {
        return plantsList;
    }

    public void setPlantsList(ArrayList<Plants> plantsList) {
        this.plantsList = plantsList;
    }
}
