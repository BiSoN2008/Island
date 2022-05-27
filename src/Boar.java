import java.util.HashMap;
import java.util.Map;

public class Boar extends Herbivorous implements Omnivorous{

    public Boar(){
        this.weight = 400;
        this.maxCountInCage = 50;
        this.speed = 2;
        this.maxCountKilogramToSaturate = 50;
        this.healthCount = 100;
        this.maxCountChildren = 7;
        this.chanceOfReproduction = 60;
    }

    private Map<String,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put("Mouse",50);
        diet.put("Caterpillar",90);
        diet.put("Plants",100);
        return diet;
    }

    @Override
    public void eat(Cell cell) {
       super.eat(cell);
       if (healthCount < 100)
           specialEat(cell,this);
    }

    @Override
    public void move() {

    }
}
