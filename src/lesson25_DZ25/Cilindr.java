package lesson25_DZ25;

public class Cilindr extends Figura {
    private double height;
    private double radius;

    public Cilindr(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2)*height;
    }

    @Override
    public void info() {
        System.out.printf("Фигура: цилиндр  | Объем фигуры: %.2f\n", getVolume());

    }
}