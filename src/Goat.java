import java.util.HashMap;
import java.util.Map;

public class Goat extends Herbivorous{

    public Goat(){
        this.weight = 60;
        this.maxCountInCage = 140;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 15;
        this.healthCount = 100;
        this.maxCountChildren = 3;
        this.chanceOfReproduction = 75;
        addDiet();
    }

    private Map<String,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put("Plants",100);
        return diet;
    }

    @Override
    public void move() {

    }
}
