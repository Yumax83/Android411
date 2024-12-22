package lesson23_DZ23_Box3D;

public class Box3D extends Box {
    private int thickness;

    public Box3D(int length, int width, int thickness) {
        super(length, width);
        setThickness(thickness);
        setWidth(width);
        setLength(length);

    }

    public Box3D(Box box, int thickness) {
        super(box);
        setThickness(thickness);
    }

    public int volume() {
        return thickness * getLength() * getWidth();
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        if (thickness < 0) {
            throw new IllegalArgumentException("Требуется положительное число");
        }
        this.thickness = thickness;
    }


    @Override
    public String toString() {
        return "Объект: Box3D {" + "длина = " + getLength() + ", ширина = " + getWidth() +
                ", глубина = " + thickness +
                '}';
    }
}

