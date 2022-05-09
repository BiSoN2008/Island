public class Horse extends Herbivorous {

    public Horse(){
        this.weight = 300;
        this.maxCountInCage = 23;
        this.speed = 3;
        this.maxCountKilogramToSaturate = 45;
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
