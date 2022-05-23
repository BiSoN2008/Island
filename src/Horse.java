import java.util.HashMap;
import java.util.Map;

public class Horse extends Herbivorous {

    public Horse(){
        this.weight = 400;
        this.maxCountInCage = 20;
        this.speed = 4;
        this.maxCountKilogramToSaturate = 60;
        this.healthCount = 95;
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

    @Override
    public void reproduce(Cell cell) {

    }

    @Override
    public void dead() {

    }
}
