import java.util.HashMap;
import java.util.Map;

public class Buffalo extends Herbivorous{

    public Buffalo(){
        this.weight = 700;
        this.maxCountInCage = 10;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 100;
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
