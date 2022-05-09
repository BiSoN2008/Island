public class Deer extends Herbivorous{

    public Deer(){
        this.weight = 170;
        this.maxCountInCage = 41;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 26;
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
