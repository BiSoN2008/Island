import java.util.HashMap;
import java.util.Map;

public class Eagle extends Predator{

    public Eagle(){
        this.weight = 6;
        this.maxCountInCage = 20;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 1;
        this.healthCount = 100;
        addDiet();
    }

    private Map<Class,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put(Fox.class,10);
        diet.put(Rabbit.class,90);
        diet.put(Mouse.class,90);
        diet.put(Duck.class,80);
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
