public class Caterpillar extends Herbivorous{

    public Caterpillar(){
        this.weight = 0.01;
        this.maxCountInCage = 10000;
        this.speed = 1;
        this.maxCountKilogramToSaturate = 0.0025;
        this.countTackToAlive = 1;
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
