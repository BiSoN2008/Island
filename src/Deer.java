import java.util.HashMap;
import java.util.Map;

public class Deer extends Herbivorous{

    public Deer(){
        this.weight = 300;
        this.maxCountInCage = 20;
        this.speed = 4;
        this.maxCountKilogramToSaturate = 50;
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
