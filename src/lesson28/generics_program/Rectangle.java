package lesson28.generics_program;

//public class Rectangle extends Figure{
    public class Rectangle implements Figure{
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
