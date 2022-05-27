import java.util.ArrayList;
import java.util.concurrent.*;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Plants> list = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Eagle());
        animals.add(new Eagle());
        animals.add(new Bear());
        animals.add(new Bear());
        animals.add(new Fox());
        animals.add(new Fox());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
//

        Island island = new Island(5, 5);
        island.getCell(0, 0).setAnimalList(animals);
        island.getCell(0, 1).setAnimalList(animals);
        island.getCell(0, 2).setAnimalList(animals);
        island.getCell(0, 0).setPlantsList(list);
        island.getCell(0, 1).setPlantsList(list);
        island.getCell(0, 2).setPlantsList(list);




        ExecutorService executorService = Executors.newCachedThreadPool();
        ScheduledExecutorService executorService1 = Executors.newScheduledThreadPool(1);
        executorService1.scheduleAtFixedRate(new PrintStatistics(),0,2,TimeUnit.SECONDS);

        while (true) {
            for (int i = 0; i < island.getHeight(); i++) {
                for (int j = 0; j < island.getWidth(); j++) {
                    executorService.execute(island.getCell(i, j));
                }

            }
//            executor.scheduleAtFixedRate(,0,3000, TimeUnit.MILLISECONDS);
            try {
                Thread.sleep(2000);
                StatisticClass.countTack++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
