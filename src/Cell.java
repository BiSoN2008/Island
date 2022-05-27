import java.util.ArrayList;

public class Cell implements Runnable{
    private ArrayList<Animal> animalList;
    private ArrayList<Plants> plantsList;
    private int cellPositionHeight = -1;
    private int cellPositionWidth = -1;

    public Cell() {
        this.animalList = new ArrayList<>();
        this.plantsList = new ArrayList<>();
    }
    @Override
    public void run() {
        ArrayList<Animal> tempList = new ArrayList<>(this.animalList);
        for (int k = 0; k < animalList.size(); k++) {
            if (this.animalList.get(k).healthCount < 0) {
                animalList.get(k).dead();
                tempList.remove(this.animalList.get(k));
            }
        }
        this.setAnimalList(tempList);

        for (int l = 0; l < this.animalList.size(); l++) {
            this.animalList.get(l).eat(this);
        }

        tempList = new ArrayList<>(this.animalList);
        for (int m = 0; m < tempList.size(); m++) {
            tempList.get(m).reproduce(this);
        }
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
