import java.util.HashMap;
import java.util.Map;

public class Wolf extends Predator{

    public Wolf(){
        this.weight = 50;
        this.maxCountInCage = 30;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 8;
        this.healthCount = 100;
        addDiet();
    }

    private Map<Class,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put(Fox.class,15);
        diet.put(Horse.class,10);
        diet.put(Deer.class,15);
        diet.put(Rabbit.class,60);
        diet.put(Mouse.class,80);
        diet.put(Goat.class,60);
        diet.put(Sheep.class,70);
        diet.put(Boar.class,15);
        diet.put(Buffalo.class,10);
        diet.put(Duck.class,40);
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
