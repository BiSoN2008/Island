import java.util.HashMap;
import java.util.Map;

public class Bear extends Predator{

    public Bear(){
        this.weight = 500;
        this.maxCountInCage = 5;
        this.speed = 2;
        this.maxCountKilogramToSaturate = 80;
        this.healthCount = 100;
        addDiet();
    }

    private Map<Class,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put(Boa.class,80);
        diet.put(Horse.class,40);
        diet.put(Deer.class,80);
        diet.put(Rabbit.class,80);
        diet.put(Mouse.class,90);
        diet.put(Goat.class,70);
        diet.put(Sheep.class,70);
        diet.put(Boar.class,50);
        diet.put(Buffalo.class,20);
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
