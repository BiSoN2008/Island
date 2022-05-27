import java.util.HashMap;
import java.util.Map;

public class Deer extends Herbivorous{

    public Deer(){
        this.weight = 300;
        this.maxCountInCage = 20;
        this.speed = 4;
        this.maxCountKilogramToSaturate = 50;
        this.healthCount = 100;
        this.maxCountChildren = 1;
        this.chanceOfReproduction = 80;
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
