import java.util.HashMap;
import java.util.Map;

public class Caterpillar extends Herbivorous{

    public Caterpillar(){
        this.weight = 0.01;
        this.maxCountInCage = 1000;
        this.speed = 0;
        this.maxCountKilogramToSaturate = 0;
        this.healthCount = 78;
        this.maxCountChildren = 20;
        this.chanceOfReproduction = 20;
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
