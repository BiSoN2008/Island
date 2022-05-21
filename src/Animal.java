import java.util.Map;

public abstract class Animal {
    protected double weight;

    protected int maxCountInCage;

    protected int speed;

    protected double maxCountKilogramToSaturate;

    protected double healthCount;

    protected Map<Class, Integer> diet;

    public abstract void eat(Cell cell);

    public abstract void move();

    public abstract void reproduce(Cell cell);

    public abstract void dead();


}
