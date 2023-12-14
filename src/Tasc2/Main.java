package Tasc2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<City> cities = new LinkedHashSet<>(Set.of(
            new City(1,"Osh"),
                new City(2,"Naryn"),
                new City(3,"Naryn"),
                new City(4,"Talas"),
                new City(5,"Jalal-Abat"),
                new City(6,"Bishkek"),
                new City(7,"Batken"),
                new City(8,"Typ"),
                new City(9,"Cholpon-Ata")
        ));

        TreeSet<City> treeSet = new TreeSet<>();
        for (City city : cities) {
            if (!(city.getCode() % 2 == 0)){
                treeSet.add(city);
            }
        }
        System.out.println(treeSet.reversed());
    }
}
