import java.util.ArrayList;
import java.util.Map;

public class Island {
    public static void main(String[] args) {
        Cell cell = new Cell();
        ArrayList<Plants> list = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();
        list.add(new Plants());
        list.add(new Plants());

        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        cell.setPlantsList(list);
        cell.setAnimalList(animals);

        Mouse mouse = new Mouse();
        System.out.println("Health start: " + mouse.healthCount);
        mouse.eat(cell);
        System.out.println("Health final: " + mouse.healthCount);


        for (Map.Entry<String, Integer> entry : StatisticClass.eatenPlantsCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("Count " + key + " eaten - " + value);
        }
        for (Map.Entry<String, Integer> entry : StatisticClass.deadCountAnimals.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("Count " + key + " eaten - " + value);
        }

        System.out.println("Plants size = "+cell.getPlantsList().size());
        System.out.println("Animals size = "+cell.getAnimalList().size());


    }

}
