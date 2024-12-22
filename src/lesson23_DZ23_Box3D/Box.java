package lesson23_DZ23_Box3D;

public class Box {
    private int length;
    private int width;

    public Box(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public Box(Box other) {
        this.width = other.width;
        this.length = other.length;

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Требуется положительное число");
        }
        this.length = length;
    }

    public int getWidth() {
        if (width < 0) {
            throw new IllegalArgumentException("Требуется положительное число");
        }
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
