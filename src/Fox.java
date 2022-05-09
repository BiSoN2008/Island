public class Fox extends Predator{

    public Fox(){
        this.weight = 4;
        this.maxCountInCage = 50;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 1;
        this.countTackToAlive = 8;
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
