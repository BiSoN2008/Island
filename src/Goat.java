public class Goat extends Herbivorous{

    public Goat(){
        this.weight = 65;
        this.maxCountInCage = 107;
        this.speed = 1;
        this.maxCountKilogramToSaturate = 10;
        this.countTackToAlive = 5;
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
