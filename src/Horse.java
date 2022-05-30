import java.util.HashMap;
import java.util.Map;

public class Horse extends Herbivorous {

    public Horse(){
        this.weight = 400;
        this.maxCountInCage = 20;
        this.speed = 4;
        this.maxCountKilogramToSaturate = 60;
        this.healthCount = 100;
        this.maxCountChildren = 2;
        this.chanceOfReproduction = 95;
        addDiet();
    }

    private Map<String,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put("Plants",100);
        return diet;
    }

}
