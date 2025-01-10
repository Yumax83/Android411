package lesson25_DZ25;

public class Shar extends Figura {
    private double radius;

    public Shar(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 4 / 3 * (Math.pow(radius, 3) * Math.PI);
    }

    @Override
    public void info() {
        System.out.printf("Фигура: шар      | Объем фигуры: %.2f\n", getVolume());
    }

}
