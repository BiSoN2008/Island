import java.util.HashMap;
import java.util.Map;

public class Fox extends Predator{

    public Fox(){
        this.weight = 8;
        this.maxCountInCage = 30;
        this.speed = 2;
        this.maxCountKilogramToSaturate = 2;
        this.healthCount = 100;
        addDiet();
    }

    private Map<String,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put("Rabbit",70);
        diet.put("Mouse",90);
        diet.put("Duck",60);
        diet.put("Caterpillar",40);
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
