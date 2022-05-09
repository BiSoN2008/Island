public class Duck extends Herbivorous{

    public Duck(){
        this.weight = 1;
        this.maxCountInCage = 500;
        this.speed = 1;
        this.maxCountKilogramToSaturate = 0.15;
        this.countTackToAlive = 4;
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
