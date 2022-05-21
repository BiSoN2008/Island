import java.util.HashMap;
import java.util.Map;

public class Caterpillar extends Herbivorous{

    public Caterpillar(){
        this.weight = 0.01;
        this.maxCountInCage = 1000;
        this.speed = 0;
        this.maxCountKilogramToSaturate = 0;
        this.healthCount = 100;
        addDiet();
    }

    private Map<Class,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put(Plants.class,100);
        return diet;
    }

    @Override
    public void eat(Cell cell) {

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
