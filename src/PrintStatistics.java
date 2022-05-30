import java.util.Map;

public class PrintStatistics implements Runnable{
    @Override
    public void run() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("<*******************************Start tact***************************>");
        for (Map.Entry<String, Integer> entry : StatisticClass.bornCountAnimals.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
           stringBuilder.append("Count born " + key + " : " + value +" || ");
        }
        System.out.println(stringBuilder);
        stringBuilder.setLength(0);
        for (Map.Entry<String, Integer> entry : StatisticClass.deadCountAnimals.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            stringBuilder.append("Count dead " + key + " : " + value+" || ");
        }
        System.out.println(stringBuilder);
        stringBuilder.setLength(0);
        for (Map.Entry<String, Integer> entry : StatisticClass.eatenPlantsCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            stringBuilder.append("Count eaten " + key + " : " + value);
        }
        System.out.println(stringBuilder);
        stringBuilder.setLength(0);
        for (Map.Entry<String, Integer> entry : StatisticClass.grownPlantsCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            stringBuilder.append("Count grown " + key + " : " + value);
        }
        System.out.println(stringBuilder);
        stringBuilder.setLength(0);

        System.out.println("Tact : "+StatisticClass.countTack);
        System.out.println("<-----------------------End Tact------------------------------------------------------->"+"\n");


    }
}
