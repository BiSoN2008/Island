import java.util.HashMap;
import java.util.Map;

public class Buffalo extends Herbivorous{

    public Buffalo(){
        this.weight = 700;
        this.maxCountInCage = 10;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 100;
        this.healthCount = 100;
        this.maxCountChildren = 2;
        this.chanceOfReproduction = 45;
        addDiet();
    }

    private Map<String,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put("Plants",100);
        return diet;
    }
}
