package lesson25.shape;

import lesson25.shaps.Shape;

abstract class Shape {
    private int width;
    private String color;

    public Shape(int width, String color) {
        this.width = width;
        this.color = color;
    }
    abstract void draw();
}
class Line extends Shape{
    private int x1,x2,y1,y2;

    public Line(int width, String color, int x1, int x2, int y1, int y2) {
        super(width, color);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
}

    @Override
    public void draw() {
        System.out.println("Рисование линии");
    }
class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Рисование прямоугольника");
    }
}
