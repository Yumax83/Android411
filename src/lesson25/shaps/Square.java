package lesson25.shaps;

public class Square extends Shape{
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public Square(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimetr() {
        return side*4;
    }

    @Override
    public void info() {
        System.out.println("=== Квадрат ===\nСторона: "+side +
                "\nЦвет: "+getColor()+"\nПлощадь: "+getArea()+
                "\nПертметр: "+getPerimetr());
        draw();

    }
    @Override
    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
