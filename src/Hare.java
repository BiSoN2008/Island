public class Hare extends Herbivorous{

    public Hare(){
        this.weight = 3;
        this.maxCountInCage = 750;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 0.45;
        this.countTackToAlive = 7;
        this.healthCount = 100;
        this.countTackWithoutFood = 0;
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
