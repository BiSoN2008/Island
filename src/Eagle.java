import java.util.HashMap;
import java.util.Map;

public class Eagle extends Predator{

    public Eagle(){
        this.weight = 6;
        this.maxCountInCage = 20;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 1;
        this.healthCount = 50;
        this.maxCountChildren = 4;
        this.chanceOfReproduction = 90;
        addDiet();
    }

    private Map<String,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put("Fox",10);
        diet.put("Rabbit",90);
        diet.put("Mouse",90);
        diet.put("Duck",80);
        return diet;
    }

    @Override
    public void move() {

    }
}
