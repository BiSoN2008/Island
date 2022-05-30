import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGrownPlants implements Runnable {
    private Island island;

    public RandomGrownPlants(Island island) {
        this.island = island;
    }
    //Проверяем столько травы есть в ячейке, если меньше чем максимальное количество
    //Считам сколько можно максисмум добавить, и кидайем рандом в этом диапозоне, и добавляем результут в ячейку.
    @Override
    public void run() {
        CopyOnWriteArrayList<Plants> plantsList = new CopyOnWriteArrayList<>();
        int randomCountPlant = 0;
        for (int i = 0; i < island.getHeight(); i++) {
            for (int j = 0; j < island.getWidth(); j++) {
                if (island.getCell(i, j).getPlantsList().size() < Plants.maxCountInCell) {
                    randomCountPlant = ThreadLocalRandom.current().nextInt(0, Plants.maxCountInCell - island.getCell(i, j).getPlantsList().size());
                    for (int k = 0; k < randomCountPlant; k++) {
                        plantsList.add(new Plants());
                        if (!StatisticClass.grownPlantsCount.containsKey("Plants")) {
                            StatisticClass.grownPlantsCount.put("Plants", 1);
                        } else {
                            StatisticClass.grownPlantsCount.put("Plants", StatisticClass.grownPlantsCount.get("Plants") + 1);
                        }
                    }
                    island.getCell(i, j).setPlantsList(new CopyOnWriteArrayList<>(plantsList));
                    plantsList = new CopyOnWriteArrayList<>();

                }
            }
        }
    }
}
