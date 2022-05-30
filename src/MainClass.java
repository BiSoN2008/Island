import java.util.concurrent.*;

public class MainClass {
    public static void main(String[] args) {
        Island island = new Island(100, 20);
        RandomSettlement randomSettlement = new RandomSettlement(island);
        randomSettlement.randomSettlementIsland();


        ScheduledExecutorService executorService1 = Executors.newScheduledThreadPool(12);
        executorService1.scheduleAtFixedRate(new RandomGrownPlants(island),0,6,TimeUnit.SECONDS);
        executorService1.scheduleAtFixedRate(new PrintStatistics(),0,2,TimeUnit.SECONDS);

        ExecutorService executorService = Executors.newCachedThreadPool();
        while (true) {
                    executorService.execute(new AnimalsLifeCycle(island));
            try {
                Thread.sleep(2000);
                StatisticClass.countTack++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
