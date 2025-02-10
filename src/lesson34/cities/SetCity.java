package lesson34.cities;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCity {
    private Set<City> hash = new HashSet<>();
    private Set<City> tree = new TreeSet<>();

    private boolean isEven(int code) {
        return code % 2 == 0;
    }


    public boolean addCity(String name, int code) {
        boolean result = name.length() > 0 && code > 0;

        if (result) {
            if (isEven(code)) {
                hash.add(new City(name, code));
            } else {
                tree.add(new City(name, code));
            }


        }
        return result;

    }

//        public void removeCityByFilter (int minAmountSymbol, int maxAmountSymbol){
//        hash.removeIf(City x ->  x.getName().lenght()< minAmountSymbol || x.getName().lenght() > maxAmountSymbol);
//    }
    public void printReversSort() {
        TreeSet<City> treeSet = new TreeSet<>(tree);
        treeSet.addAll(hash);
        Iterator<City> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Список городов с четным кодом (HashSet):\n");
        for (City city : hash) {
            sb.append(city).append("\n");
        }
        sb.append("\n").append("Список городов с нечетным кодом (TreeSet):\n");
        for (City city : tree) {
            sb.append(city).append("\n");
        }

        return sb.toString();
    }


}
