import java.util.HashMap;
import java.util.Map;

public class Boar extends Herbivorous{

    public Boar(){
        this.weight = 400;
        this.maxCountInCage = 50;
        this.speed = 2;
        this.maxCountKilogramToSaturate = 50;
        this.healthCount = 100;
    }

    private Map<Class,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put(Mouse.class,50);
        diet.put(Caterpillar.class,90);
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
