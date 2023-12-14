import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car(1, 2004);
       Car car2 = new Car(2, 0204);
        Car car3 = new Car(3, 0501);
        Car car4 = new Car(4, 21234);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        System.out.println(cars);


        ArrayList<CarModels> carModels = new ArrayList<>(List.of(
                new CarModels(2003, "Honda", 200230, "white"),
                new CarModels(1999, "Mers", 200455, "white"),
                new CarModels(2000, "Audi", 4000, "Kara"),
                new CarModels(1998, "Tico", 25000, "white"),
                new CarModels(1988, "BMW", 15000, "kok"),
                new CarModels(1994, "Sanata", 50000, "white"),
                new CarModels(1995, "Labo", 1000, "kyzyl")
        ));
        get(cars,carModels);


    }
    public static void get(ArrayList<Car>carArrayList,ArrayList<CarModels> carModelsArrayList){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(carArrayList.size(),carModelsArrayList.size());


        for (Map.Entry<Integer, Integer> a  : hashMap.entrySet()) {
            System.out.println(a.getKey()+"   " + a.getValue());
        }





    }





    }
