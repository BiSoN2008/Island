import java.util.HashMap;
import java.util.Map;

public class Wolf extends Predator{

    public Wolf(){
        this.weight = 50;
        this.maxCountInCage = 30;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 8;
        this.healthCount = 100;
        this.maxCountChildren = 3;
        this.chanceOfReproduction = 80;
        addDiet();
    }

    private Map<String,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put("Fox",15);
        diet.put("Horse",10);
        diet.put("Deer",15);
        diet.put("Rabbit",60);
        diet.put("Mouse",80);
        diet.put("Goat",60);
        diet.put("Sheep",70);
        diet.put("Boar",15);
        diet.put("Buffalo",10);
        diet.put("Duck",40);
        return diet;
    }

    @Override
    public void move() {

    }
}
