package lesson26.enums;

enum Seasons {
    WINTER("Зима"),
    SUMMER("Лето"),
    SPRING("Весна"),
    AUTUMN("Осень");

    private String title;

    Seasons(String title){
        this.title=title;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "title='" + title + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println(Seasons.WINTER);
//        System.out.println(Seasons.values());
        for (Seasons s:Seasons.values()){
            System.out.println(s);
        }

        int ind = Seasons.SUMMER.ordinal();
        System.out.println(ind);
//    Seasons arg = Seasons.SPRING;
//
//    switch (arg){
//        case WINTER:
//            System.out.println("Сейчас зима"); break;
//        case SUMMER:
//            System.out.println("Сейчса лето"); break;
//        case SPRING:
//            System.out.println("Сейчса весна"); break;
//        case AUTUMN:
//            System.out.println("Сейчса осень"); break;
//    }
    }
}
