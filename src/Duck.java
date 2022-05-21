import java.util.HashMap;
import java.util.Map;

public class Duck extends Herbivorous{

    public Duck(){
        this.weight = 1;
        this.maxCountInCage = 200;
        this.speed = 4;
        this.maxCountKilogramToSaturate = 0.15;
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
