import java.util.HashMap;
import java.util.Map;

public class Boa extends Predator{

    public Boa(){
        this.weight = 15;
        this.maxCountInCage = 30;
        this.speed = 1;
        this.maxCountKilogramToSaturate = 3;
        this.healthCount = 100;
        addDiet();
    }

    private Map<Class,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put(Fox.class,15);
        diet.put(Deer.class,5);
        diet.put(Rabbit.class,20);
        diet.put(Mouse.class,40);
        diet.put(Boar.class,5);
        diet.put(Duck.class,10);
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
