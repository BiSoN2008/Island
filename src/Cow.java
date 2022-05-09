public class Cow extends Herbivorous{

    public Cow(){
        this.weight = 350;
        this.maxCountInCage = 20;
        this.speed = 1;
        this.maxCountKilogramToSaturate = 53;
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
