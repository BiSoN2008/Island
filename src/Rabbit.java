import java.util.HashMap;
import java.util.Map;

public class Rabbit extends Herbivorous{

    public Rabbit(){
        this.weight = 2;
        this.maxCountInCage = 150;
        this.speed = 2;
        this.maxCountKilogramToSaturate = 0.45;
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
