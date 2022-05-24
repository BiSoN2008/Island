import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {

    protected double weight;

    protected int maxCountInCage;

    protected int speed;

    protected double maxCountKilogramToSaturate;

    protected double healthCount;

    protected int maxCountChildren;

    protected double chanceOfReproduction;

    protected Map<String, Integer> diet;

    public abstract void eat(Cell cell);

    public abstract void move();

    public void reproduce(Cell cell) {
        ArrayList<Animal> animals = cell.getAnimalList();
        ArrayList<Animal> tempAnimalList = new ArrayList<>(animals);
        int chanceToReproduction = ThreadLocalRandom.current().nextInt(0, 100);
        int countChildren = ThreadLocalRandom.current().nextInt(0, maxCountChildren);
        int countInCage = 0;

        for (Animal animal : animals) {
            if (animal.getClass() == this.getClass()) {
                countInCage++;
            }
        }
        if ((countInCage < maxCountInCage) && (countInCage > 1) && (chanceToReproduction < chanceOfReproduction)) {
            for (int i = 0; i < countChildren; i++) {
                Constructor<?>[] constructors = this.getClass().getConstructors();
                try {
                    tempAnimalList.add((Animal) constructors[0].newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Не удалось создать объект");
                }

                if (!StatisticClass.bornCountAnimals.containsKey(this.getClass().getName())) {
                    StatisticClass.bornCountAnimals.put(this.getClass().getName(), 1);
                } else {
                    StatisticClass.bornCountAnimals.put(this.getClass().getName(), StatisticClass.bornCountAnimals.get(this.getClass().getName()) + 1);
                }
            }

        }
        cell.setAnimalList(tempAnimalList);
    }

    public void dead(){
        if (!StatisticClass.deadCountAnimals.containsKey(this.getClass().getName())) {
            StatisticClass.deadCountAnimals.put(this.getClass().getName(), 1);
        } else {
            StatisticClass.deadCountAnimals.put(this.getClass().getName(), StatisticClass.deadCountAnimals.get(this.getClass().getName()) + 1);
        }
    }


}
