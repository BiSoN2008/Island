public class Hamster extends Herbivorous{

    public Hamster(){
        this.weight = 0.03;
        this.maxCountInCage = 10000;
        this.speed = 1;
        this.maxCountKilogramToSaturate = 0.0075;
        this.countTackToAlive = 3;
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
