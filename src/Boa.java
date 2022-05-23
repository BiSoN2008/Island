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

    private Map<String,Integer> addDiet(){
        diet = new HashMap<>();
        diet.put("Fox",15);
        diet.put("Deer",5);
        diet.put("Rabbit",20);
        diet.put("Mouse",40);
        diet.put("Boar",5);
        diet.put("Duck",10);
        return diet;
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
