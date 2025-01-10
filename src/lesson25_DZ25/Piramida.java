package lesson25_DZ25;

public class Piramida extends Figura{
    private double height;
    private double basearea;

    public Piramida(double height, double basearea) {
        this.height = height;
        this.basearea = basearea;
    }

    @Override
    public double getVolume() {
        return basearea/3*height;
    }

    @Override
    public void info() {
        System.out.printf("Фигура: пирамида | Объем фигуры: %.2f\n", getVolume());
    }
}

