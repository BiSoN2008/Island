import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StatisticClass {
    public static Map<String,Integer> deadCountAnimals = new ConcurrentHashMap<>();
    public static Map<String,Integer> bornCountAnimals = new ConcurrentHashMap<>();
    public static Map<String,Integer> eatenPlantsCount = new ConcurrentHashMap<>();
    public static Map<String,Integer> grownPlantsCount = new ConcurrentHashMap<>();
    public static int countTack = 0;


}
