public class Sheep extends Herbivorous  {

    public Sheep(){
        this.weight = 45;
        this.maxCountInCage = 156;
        this.speed = 1;
        this.maxCountKilogramToSaturate = 7;
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
