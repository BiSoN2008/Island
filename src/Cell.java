import java.util.ArrayList;

public class Cell {
    private ArrayList<Animal> animalList;
    private ArrayList<Plants> plantsList;

    public Cell() {
        this.animalList = new ArrayList<>();
        this.plantsList = new ArrayList<>();
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
