package lesson24_2;

public class Main {
    public static void main(String[] args) {
        First first = new First(10, 10, "yellow");
        first.showInfo();
        Second second = new Second(10,10,"1x232");
        second.showInfo();
    }
}

class Rectangle {
    private int width;
    private int lenght;

    public Rectangle(int width, int lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public void showInfo() {
        System.out.printf("\nПрямоугольник\nДлина: %s\nШирина: %s", width, lenght);
    }
}

class First extends Rectangle {
    private String background;

    public First(int width, int lenght, String background) {
        super(width, lenght);
        this.background = background;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\nРамка: %s", background);
    }
}

class Second extends Rectangle {
    private String ground;

    public Second(int width, int lenght, String ground) {
        super(width, lenght);
        this.ground = ground;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\nРамка: %s", ground);
    }
}

