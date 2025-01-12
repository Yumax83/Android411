package lesson25.shaps;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimetr() {
        return (width + height) * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void info() {
        System.out.println("=== Прямоугольник===\nШирина: " + width +
                "\nВысота: " + height +
                "\nЦвет: " + getColor() + "\nПлощадь: " + getArea() +
                "\nПертметр: " + getPerimetr());
        draw();
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
