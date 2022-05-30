import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class RandomSettlement{
    private Island island;

    public RandomSettlement(Island island) {
        this.island = island;
    }

    //Заселение острова
    public void randomSettlementIsland() {
        for (int i = 0; i < island.getHeight(); i++) {
            for (int j = 0; j < island.getWidth(); j++) {
                island.getCell(i,j).setAnimalList(randomSettlementCell());
            }
        }
    }
    //Заселение ячейки острова
    private ArrayList<Animal> randomSettlementCell() {
        ThreadLocalRandom random = null;
        ArrayList<Animal> animalList = new ArrayList<>();
        ArrayList<Animal> tempAnimalList = new ArrayList<>();
        ArrayList<Animal> randomListAnimal = new ArrayList<>();
        animalList.add(new Bear());
        animalList.add(new Boa());
        animalList.add(new Boar());
        animalList.add(new Buffalo());
        animalList.add(new Caterpillar());
        animalList.add(new Deer());
        animalList.add(new Duck());
        animalList.add(new Eagle());
        animalList.add(new Fox());
        animalList.add(new Goat());
        animalList.add(new Horse());
        animalList.add(new Mouse());
        animalList.add(new Rabbit());
        animalList.add(new Sheep());
        animalList.add(new Wolf());

        for (int i = 0; i < ThreadLocalRandom.current().nextInt(0,animalList.size()-1); i++) {
            Collections.shuffle(animalList);
            tempAnimalList.add(animalList.get(i));
        }
        animalList = tempAnimalList;
        for (Animal animal : animalList) {
            if (animal instanceof Bear) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Boa) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Boar) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Buffalo) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Caterpillar) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Deer) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Duck) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Eagle) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Fox) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Goat) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Horse) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Mouse) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Rabbit) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Sheep) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            } else if (animal instanceof Wolf) {
                randomListAnimal.addAll(addOneKindOfAnimal(animal));
            }
        }
        return randomListAnimal;
    }

    //Метод для создания рандомного количество одного вида в ячейке
    private ArrayList<Animal> addOneKindOfAnimal(Animal animal) {
        ArrayList<Animal> tempList = new ArrayList<>();
        Constructor<?>[] constructors = animal.getClass().getConstructors();
        int countAnimal = ThreadLocalRandom.current().nextInt(0, animal.maxCountInCage);
        for (int i = 0; i < countAnimal; i++) {
            try {
                tempList.add((Animal) constructors[0].newInstance());
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return tempList;
    }
}
