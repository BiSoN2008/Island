import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

//Для травоядных которые могут есть не только травку

public interface Omnivorous {
    default void specialEat(Cell cell, Animal animal) {
        ArrayList<Animal> animalList = cell.getAnimalList();
        ArrayList<Animal> tempList = new ArrayList<>(animalList);
        int chanceToEat = ThreadLocalRandom.current().nextInt(0, 100);
        int indexEatenObject = -1;
        Animal tempAnimal;
        if ((animal.healthCount < 100) && (animal.healthCount > 0)) {
            for (Map.Entry<String, Integer> entry : animal.diet.entrySet()) {
                var key = entry.getKey();
                Integer value = entry.getValue();
                for (int i = 0; i < animalList.size(); i++) {
                    if (animalList.get(i).getClass().getName().equals(key)) {
                        if (chanceToEat < value) {
                            indexEatenObject = i;
                            tempAnimal = animalList.get(i);
                            if (animalList.get(i).weight >= animal.maxCountKilogramToSaturate) {
                                animal.healthCount = 100;
                            } else {
                                double percentOfSaturate = (animalList.get(i).weight / animal.maxCountKilogramToSaturate) * 100;
                                animal.healthCount += percentOfSaturate;
                                if (animal.healthCount > 100)
                                    animal.healthCount = 100;
                            }
                            if (!StatisticClass.deadCountAnimals.containsKey(animalList.get(indexEatenObject).getClass().getName())) {
                                StatisticClass.deadCountAnimals.put(animalList.get(indexEatenObject).getClass().getName(), 1);
                            } else {
                                StatisticClass.deadCountAnimals.put(animalList.get(indexEatenObject).getClass().getName(), StatisticClass.deadCountAnimals.get(animalList.get(indexEatenObject).getClass().getName()) + 1);
                            }

                            tempList.removeIf(nextAnimal -> nextAnimal.equals(tempAnimal));
                            cell.setAnimalList(tempList);
                            return;

                        } else {
                            animal.healthCount -= 10;
                        }
                    }
                }
            }            animal.healthCount -= 10;
        } else animal.healthCount -= 10;
    }

}
