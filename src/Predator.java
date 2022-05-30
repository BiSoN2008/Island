import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Predator extends Animal {

    //У хищника одна попытка поесть за такт
    @Override
    public void eat(Cell cell) {
        ArrayList<Animal> animalList = cell.getAnimalList();
        ArrayList<Animal> tempList = new ArrayList<>(animalList);
        int chanceToEat = ThreadLocalRandom.current().nextInt(0, 100);
        int indexEatenObject = -1;
        Animal tempAnimal;
        if ((healthCount < 100) && (healthCount > 0)) {                     //Проверяем количество здоровья
            for (Map.Entry<String, Integer> entry : diet.entrySet()) {          //Цикл по мапе с диетой
                var key = entry.getKey();
                Integer chanceOfBeingEaten = entry.getValue();
                for (int i = 0; i < animalList.size(); i++) {
                    if (animalList.get(i).getClass().getName().equals(key)) {       //Проверяем есть ли в ячейке тот кого можно съесть
                        if (chanceToEat < chanceOfBeingEaten) {                    // Шанс на поесть
                            indexEatenObject = i;
                            tempAnimal = animalList.get(i);
                            if (animalList.get(i).weight >= maxCountKilogramToSaturate) {       //Если вес съедамого больше чем вес нужный для насыщения, то здоровье ставим 100
                                healthCount = 100;
                            } else {
                                double percentOfSaturate = (animalList.get(i).weight / maxCountKilogramToSaturate) * 100;           //Если вес съеденого меньше чем нужно для насыщения, считаем какой будет процент от полного насыщения.
                                healthCount += percentOfSaturate;
                                if (healthCount > 100)                                      //Если переели здоровье равно 100
                                    healthCount = 100;
                            }   //Записываем данные в мапу статистики
                            if (!StatisticClass.deadCountAnimals.containsKey(animalList.get(indexEatenObject).getClass().getName())) {
                                StatisticClass.deadCountAnimals.put(animalList.get(indexEatenObject).getClass().getName(), 1);
                            } else {
                                StatisticClass.deadCountAnimals.put(animalList.get(indexEatenObject).getClass().getName(), StatisticClass.deadCountAnimals.get(animalList.get(indexEatenObject).getClass().getName()) + 1);
                            }

                            tempList.removeIf(nextAnimal -> nextAnimal.equals(tempAnimal));
                            cell.setAnimalList(tempList);
                            return;
                        } else { //Если не поели отнимам здоровье и выходим.
                            healthCount -= 10;
                            return;
                        }
                    }
                }
            }
        } else { //Если полностью сыты, отнимаем здоровье
            healthCount -= 10;

        }
    }
}
