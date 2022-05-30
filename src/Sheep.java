import java.util.HashMap;
import java.util.Map;

public class Sheep extends Herbivorous  {

    public Sheep(){
        this.weight = 70;
        this.maxCountInCage = 140;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 15;
        this.healthCount = 100;
        this.maxCountChildren = 5;
        this.chanceOfReproduction = 80;
        addDiet();
    }

    private Map<String,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put("Plants",100);
        return diet;
    }
}
