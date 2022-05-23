import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Herbivorous extends Animal {
    @Override
    public void eat(Cell cell) {
        ArrayList<Plants> plantsList = cell.getPlantsList();
        ArrayList<Plants> tempList = new ArrayList<>(plantsList);
        int chanceToEat = ThreadLocalRandom.current().nextInt(0, 100);
        int indexEatenObject = -1;
        Plants tempPlants;

        if ((healthCount < 100) && (healthCount > 0)) {                     //проверяем количество здоровья

            for (Map.Entry<String, Integer> entry : diet.entrySet()) {          //запускаме цикл по мапе с диетой
                var key = entry.getKey();
                Integer value = entry.getValue();

                for (int i = 0; i < plantsList.size(); i++) {               // запускаем цикл по листу с растениями
                    if (plantsList.get(i).getClass().getName().equals(key)) {                   //Если имя класса совпадает с ключом диеты, значит едим

                        if (chanceToEat < value) {                                          //Проверяем веротность можно ли съесть
                            indexEatenObject = i;                                           //Получаем индекс элемента который будет съеден
                            tempPlants = plantsList.get(i);

                            if (plantsList.get(i).weight >= maxCountKilogramToSaturate) {               //Проверяем вес съеденного, если больше веса для полного насыщения, то насыщение равно 100
                                healthCount = 100;
                            } else {
                                double percentOfSaturate = (plantsList.get(i).weight / maxCountKilogramToSaturate) * 100;           //Считаем какой процент насыщения будет, от личества съеденного.
                                healthCount += percentOfSaturate;
                                if (healthCount > 100)                                                                              //Если переели, процент насыщения равен 100
                                    healthCount = 100;
                            }

                            if (!StatisticClass.eatenPlantsCount.containsKey(plantsList.get(indexEatenObject).getClass().getName())) {              //Добавляем съеденный элемент в статистику
                                StatisticClass.eatenPlantsCount.put(plantsList.get(indexEatenObject).getClass().getName(), 1);
                            } else {
                                StatisticClass.eatenPlantsCount.put(plantsList.get(indexEatenObject).getClass().getName(), StatisticClass.eatenPlantsCount.get(plantsList.get(indexEatenObject).getClass().getName()) + 1);
                            }

                            Iterator<Plants> plantsIterator = tempList.iterator(); //удаляем съеденный элемент из копии листа
                            while (plantsIterator.hasNext()) {
                                Plants nextPlants = plantsIterator.next();
                                if (nextPlants.equals(tempPlants)) {
                                    plantsIterator.remove();
                                }
                            }
                            cell.setPlantsList(tempList);       //записываем новый лист без съеденного элемента в ячейку
                            if (healthCount >= 100) {                  // Если наелись, выходим из метода.
                                return;
                            }

                        } else {

                            healthCount -= 10;
                        }
                    }
                }
            }
        }
    }
}

