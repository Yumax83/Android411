package lesson21;

import static java.lang.System.*;

public class Program {
    public static void main(String[] args) {
        Point p1=new Point(1,2);
        Point p2=new Point(3,4);
        Point p3=new Point(5,6);
        System.out.println(Point.getCount());
       // System.out.println(p1.count);
        out.println(Point.getCount());
    }
}
class Point{
    private static int count; //статический
    int x; //динамический
    int y; //динамический

    static {
        count=10;
    }

    public Point(int x, int y) { //автоматический конструктор статик не берет
        this.x = x;
        this.y = y;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
