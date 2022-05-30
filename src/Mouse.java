import java.util.HashMap;
import java.util.Map;

public class Mouse extends Herbivorous implements Omnivorous{

    public Mouse(){
        this.weight = 0.05;
        this.maxCountInCage = 500;
        this.speed = 1;
        this.maxCountKilogramToSaturate = 0.015;
        this.healthCount = 100;
        this.maxCountChildren = 15;
        this.chanceOfReproduction = 80;
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
