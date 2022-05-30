import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cell {
    private ArrayList<Animal> animalList;
    private CopyOnWriteArrayList<Plants> plantsList;
    private CopyOnWriteArrayList<Animal> thoseHoCameAnimal;
    private int cellPositionHeight = -1;
    private int cellPositionWidth = -1;

    public Cell() {
        this.animalList = new ArrayList<>();
        this.plantsList = new CopyOnWriteArrayList<>();
        this.thoseHoCameAnimal = new CopyOnWriteArrayList<>();
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

    public CopyOnWriteArrayList<Plants> getPlantsList() {
        return plantsList;
    }

    public void setPlantsList(CopyOnWriteArrayList<Plants> plantsList) {
        this.plantsList = plantsList;
    }

    public void setThoseHoCameAnimal(CopyOnWriteArrayList<Animal> thoseHoCameAnimal) {
        this.thoseHoCameAnimal = thoseHoCameAnimal;
    }

    public CopyOnWriteArrayList<Animal> getThoseHoCameAnimal() {
        return thoseHoCameAnimal;
    }
}
