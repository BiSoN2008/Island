import java.util.Collection;

public abstract class Animal {
    protected double weight;

    protected int maxCountInCage;

    protected int speed;

    protected double maxCountKilogramToSaturate;

    protected int countTackToAlive;

    protected double healthCount;

    protected int countTackWithoutFood;



    public abstract void eat(Cell cell);

    public abstract void move();

    public abstract  void reproduce(Cell cell);

    public abstract void dead();

    public static boolean findFood(Collection<?> arrayList, Class clazz){
        for(Object o :arrayList){
            if (o !=null && o.getClass() == clazz){
                return true;
            }
        }
        return false;
    }

}
