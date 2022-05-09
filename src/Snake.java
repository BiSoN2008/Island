public class Snake extends Predator{

    public Snake(){
        this.weight = 2;
        this.maxCountInCage = 123;
        this.speed = 1;
        this.maxCountKilogramToSaturate = 0.3;
        this.countTackToAlive = 15;
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
