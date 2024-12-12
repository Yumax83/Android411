package Lesson20.Avtomobil;

public class Main {
    public static void main(String[] args) {
        Avtomobil avto1 = new Avtomobil();
        avto1.printInfo();

        avto1.setModel("Q7 3.0 quattro");
        avto1.setYear("2020");
        avto1.setBrand("Audi");
        avto1.setEngine_power("250 л.с.");
        avto1.setColor("Black");
        avto1.setPrice("8950000");

        System.out.println();
        avto1.printInfo();

    }
}
