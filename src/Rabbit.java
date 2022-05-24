import java.util.HashMap;
import java.util.Map;

public class Rabbit extends Herbivorous{

    public Rabbit(){
        this.weight = 2;
        this.maxCountInCage = 150;
        this.speed = 2;
        this.maxCountKilogramToSaturate = 0.45;
        this.healthCount = 100;
        this.maxCountChildren = 8;
        this.chanceOfReproduction = 100;
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
