package lesson34.cities;

public class Cities {
    public static void main(String[] args) {
        SetCity cities =new SetCity();
        cities.addCity("Москва", 495);
        cities.addCity("Санкт-Петербург", 812);
        cities.addCity("Омск", 183);
        cities.addCity("Томск", 712);
        cities.addCity("Пенза", 312);
        cities.addCity("Новосибирск", 955);
        cities.addCity("Новгород", 554);

      //  System.out.println("количество городов: " + cities.size()+"\n");

        System.out.println(cities);
    }
}
