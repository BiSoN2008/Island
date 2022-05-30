import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Herbivorous extends Animal {

    //Травоядные едят пока не насытятся,или пока есть трава.
    @Override
    public void eat(Cell cell) {
        CopyOnWriteArrayList<Plants> plantsList = cell.getPlantsList();
        ArrayList<Plants> tempList = new ArrayList<>(plantsList);
        int chanceToEat = ThreadLocalRandom.current().nextInt(0, 100);
        int indexEatenObject = -1;
        Plants tempPlants;

        if ((healthCount < 100) && (healthCount > 0)) {                     //проверяем количество здоровья

            for (Map.Entry<String, Integer> entry : diet.entrySet()) {          //запускаме цикл по мапе с диетой
                var key = entry.getKey();
                Integer chanceOfBeingEaten = entry.getValue();
                if (plantsList.size() == 0) {                                   //если нет травы данной ячейке, отнимаем здоровье и выходим.
                    healthCount -= 10;
                    return;
                } else {

                    if (!key.equals("Plants")) continue;
                    for (int i = 0; i < plantsList.size(); i++) {               // запускаем цикл по листу с растениями
                        if (plantsList.get(i).getClass().getName().equals(key)) {                   //Если имя класса совпадает с ключом диеты, значит едим

                            if (chanceToEat < chanceOfBeingEaten) {                                          //Проверяем веротность можно ли съесть
                                indexEatenObject = i;                                           //Получаем индекс элемента который будет съеден
                                tempPlants = plantsList.get(i);

                                if (Plants.weight >= maxCountKilogramToSaturate) {               //Проверяем вес съеденного, если больше веса для полного насыщения, то насыщение равно 100
                                    healthCount = 100;
                                } else {
                                    double percentOfSaturate = (Plants.weight / maxCountKilogramToSaturate) * 100;           //Считаем какой процент насыщения будет, от количества съеденного.
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
                                        break;
                                    }
                                }
                                CopyOnWriteArrayList<Plants> temp = new CopyOnWriteArrayList<>(tempList);
                                cell.setPlantsList(temp);       //записываем новый лист без съеденного элемента в ячейку
                                if (healthCount >= 100) {                  // Если наелись, выходим из метода.
                                    return;
                                }

                            } else {
                                this.healthCount -= 10;
                                return;//если не поели отнимаем 10 едениц от здоровья
                            }
                        }
                    }
                } // конец цикла по листу плэнтс
            }
        } else {
            healthCount -= 10;
        }
    }
}

