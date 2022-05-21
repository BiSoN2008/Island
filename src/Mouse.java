import java.util.HashMap;
import java.util.Map;

public class Mouse extends Herbivorous{

    public Mouse(){
        this.weight = 0.05;
        this.maxCountInCage = 500;
        this.speed = 1;
        this.maxCountKilogramToSaturate = 0.01;
        this.healthCount = 100;
        addDiet();
    }

    private Map<Class,Integer> addDiet(){
        diet = new HashMap<>();
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
