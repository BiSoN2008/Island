import java.util.HashMap;
import java.util.Map;

public class Duck extends Herbivorous implements Omnivorous{

    public Duck(){
        this.weight = 1;
        this.maxCountInCage = 200;
        this.speed = 4;
        this.maxCountKilogramToSaturate = 0.15;
        this.healthCount = 100;
        this.maxCountChildren = 6;
        this.chanceOfReproduction = 70;
        addDiet();
    }

    private Map<String,Integer> addDiet(){
        diet = new HashMap<>();
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
}
