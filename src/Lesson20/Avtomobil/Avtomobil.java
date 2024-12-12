package Lesson20.Avtomobil;

import java.util.Scanner;

public class Avtomobil {
    private String model;
    private String year;
    private String brand;
    private String engine_power;
    private String color;
    private String price;

    Scanner input = new Scanner(System.in);

    public Avtomobil() {
    }

    public Avtomobil(String model, String year, String brand, String engine_power, String color, String price) {
        this.model = model;
        this.year = year;
        this.brand = brand;
        this.engine_power = engine_power;
        this.color = color;
        this.price = price;
    }
    {
       model = "X7 M50i";
       year = "2021";
       brand = "BMW";
       engine_power = "530 л.с.";
       color = "white";
        price = "10790000";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine_power() {
        return engine_power;
    }

    public void setEngine_power(String engine_power) {
        this.engine_power = engine_power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public void printInfo() {
        System.out.println("********* Данные автомобиля ********");
        System.out.println("Название модели: " + this.model);
        System.out.println("Год выпуска: " + this.year);
        System.out.println("Производитель: " + this.brand);
        System.out.println("Мощность двигателя: " + this.engine_power);
        System.out.println("Цвет: " + this.color);
        System.out.println("Цена: " + this.price);
        System.out.println("======================================");
    }

}
