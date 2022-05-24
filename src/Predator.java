import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Predator extends Animal {
    @Override
    public void eat(Cell cell) {
        ArrayList<Animal> animalList = cell.getAnimalList();
        ArrayList<Animal> tempList = new ArrayList<>(animalList);
        int chanceToEat = ThreadLocalRandom.current().nextInt(0, 100);
        int indexEatenObject = -1;
        Animal tempAnimal;
        if ((healthCount < 100) && (healthCount > 0)) {
            for (Map.Entry<String, Integer> entry : diet.entrySet()) {
                var key = entry.getKey();
                Integer value = entry.getValue();
                for (int i = 0; i < animalList.size(); i++) {
                    if (animalList.get(i).getClass().getName().equals(key)) {
                        if (chanceToEat < value) {
                            indexEatenObject = i;
                            tempAnimal = animalList.get(i);
                            if (animalList.get(i).weight >= maxCountKilogramToSaturate) {
                                healthCount = 100;
                            } else {
                                double percentOfSaturate = (animalList.get(i).weight / maxCountKilogramToSaturate) * 100;
                                healthCount += percentOfSaturate;
                                if (healthCount > 100)
                                    healthCount = 100;
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
                            healthCount -= 10;
                        }
                    }
                }
            }
            healthCount -= 10;
        } else
           healthCount -= 10;


    }
}
