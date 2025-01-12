package lesson25.shaps;

public class Triangle extends Shape {
    private double side;

    public Triangle(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) * side * side) / 4;
    }

    @Override
    public double getPerimetr() {
        return side * 3;
    }

    @Override
    public void info() {
        System.out.printf("=== Треугольник ===\n" +
                        "Сторона: %.0f\nЦвет: %s\nПлощадь: %.1f\nПериметр: %.1f",
                side, getColor(), getArea(), getPerimetr());
        draw();
    }

    @Override
    public void draw() {
        for (int i = 0; i <= side; i++) {
            for (int j = i; j < side; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
}
