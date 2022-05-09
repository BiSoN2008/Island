public class Wolf extends Predator{

    public Wolf(){
        this.weight = 50;
        this.maxCountInCage = 30;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 8;
        this.countTackToAlive = 10;
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
