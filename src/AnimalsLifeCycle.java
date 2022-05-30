import java.util.ArrayList;

public class AnimalsLifeCycle implements Runnable {
    private Island island;

    public AnimalsLifeCycle(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        ArrayList<Animal> tempList;
        ArrayList<Animal> animalList;
        for (int i = 0; i < island.getHeight(); i++) {
            for (int j = 0; j < island.getWidth(); j++) {
                addNewComers(island.getCell(i, j));
                animalList = island.getCell(i, j).getAnimalList();
                tempList = new ArrayList<>(animalList);

                for (int k = 0; k < animalList.size(); k++) {
                    if (animalList.get(k).healthCount < 0) {
                        animalList.get(k).dead();
                        tempList.remove(animalList.get(k));
                    }
                }
                island.getCell(i, j).setAnimalList(tempList);

                for (int l = 0; l < animalList.size(); l++) {
                    animalList.get(l).eat(island.getCell(i, j));
                }

                tempList = new ArrayList<>(animalList);
                for (int m = 0; m < tempList.size(); m++) {
                    tempList.get(m).reproduce(island.getCell(i, j));
                }
                for (int k = 0; k < tempList.size(); k++) {
                    tempList.get(k).move(island.getCell(i, j), island);

                }
            }
        }
    }

    private void addNewComers(Cell cell) {
        ArrayList<Animal> animals = new ArrayList<>(cell.getAnimalList());
        ArrayList<Animal> toComeAnimals = new ArrayList<>(cell.getThoseHoCameAnimal());
        animals.addAll(toComeAnimals);
        cell.setAnimalList(animals);
    }
}
