import java.util.ArrayList;
import java.util.Map;

public class MainClass {

        public static void main(String[] args) {
        Cell cell = new Cell();
        ArrayList<Plants> list = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Eagle());
        animals.add(new Eagle());
        animals.add(new Bear());
        animals.add(new Bear());
        animals.add(new Fox());
        animals.add(new Fox());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        animals.add(new Caterpillar());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        list.add(new Plants());
        cell.setPlantsList(list);
        cell.setAnimalList(animals);
        System.out.println("plants size = " + cell.getPlantsList().size());
        System.out.println("animal size = " + cell.getAnimalList().size());

        for (int j = 0; j < 100; j++) {
            ArrayList<Animal> tempList = new ArrayList<>(cell.getAnimalList());
            for (int i = 0; i <cell.getAnimalList().size() ; i++) {
                if (cell.getAnimalList().get(i).healthCount < 0){
                    cell.getAnimalList().get(i).dead();
                    tempList.remove(cell.getAnimalList().get(i));
                }
            }
            cell.setAnimalList(tempList);

            for (int i = 0; i < cell.getAnimalList().size(); i++) {
                cell.getAnimalList().get(i).eat(cell);
//                System.out.println(cell.getAnimalList().get(i).healthCount);

            }

            tempList = new ArrayList<>(cell.getAnimalList());
            for (int i = 0; i < tempList.size(); i++) {
                tempList.get(i).reproduce(cell);
            }

            for (Map.Entry<String, Integer> entry : StatisticClass.bornCountAnimals.entrySet()) {
                String key = entry.getKey();
                ;
                Integer value = entry.getValue();
                System.out.println("Count born " + key + " : " + value);
            }

            for (Map.Entry<String, Integer> entry : StatisticClass.deadCountAnimals.entrySet()) {
                String key = entry.getKey();
                ;
                Integer value = entry.getValue();
                System.out.println("Count dead " + key + " : " + value);
            }
            for (Map.Entry<String, Integer> entry : StatisticClass.eatenPlantsCount.entrySet()) {
                String key = entry.getKey();
                ;
                Integer value = entry.getValue();
                System.out.println("Count eaten " + key + " : " + value);
            }
            System.out.println("plants size = " + cell.getPlantsList().size());
            System.out.println("animal size = " + cell.getAnimalList().size());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
