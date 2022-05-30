import java.util.HashMap;
import java.util.Map;

public class Bear extends Predator {

    public Bear() {
        this.weight = 500;
        this.maxCountInCage = 5;
        this.speed = 2;
        this.maxCountKilogramToSaturate = 80;
        this.healthCount = 100;
        this.maxCountChildren = 4;
        this.chanceOfReproduction = 80;
        addDiet();
    }

    private Map<String, Integer> addDiet() {
        diet = new HashMap<>();
        diet.put("Boa", 80);
        diet.put("Horse", 40);
        diet.put("Deer", 80);
        diet.put("Rabbit", 80);
        diet.put("Mouse", 90);
        diet.put("Goat", 70);
        diet.put("Sheep", 70);
        diet.put("Boar", 50);
        diet.put("Buffalo", 20);
        diet.put("Duck", 10);
        return diet;
    }
}
