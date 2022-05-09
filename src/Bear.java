public class Bear extends Predator{

    public Bear(){
        this.weight = 250;
        this.maxCountInCage = 7;
        this.speed = 2;
        this.maxCountKilogramToSaturate = 38;
        this.countTackToAlive = 15;
        this.healthCount = 100;
        this.countTackWithoutFood = 0;

    }
    @Override
    public void eat(Cell cell) {
        if (findFood(cell.getCell(),Animal.class)){

        }
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
