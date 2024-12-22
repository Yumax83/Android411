package lesson23_DZ23_Box3D;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(3,5);
        Box3D box3D = new Box3D(box,2);
        System.out.println(box3D);
        System.out.println("Объем: " + box3D.volume());
        System.out.println();
        box3D.setWidth(5);
        box3D.setLength(10);
        box3D.setThickness(7);
        System.out.println("Длина: " + box3D.getWidth());
        System.out.println("Ширина: " + box3D.getLength());
        System.out.println("Глубина: " + box3D.getThickness());
        System.out.println("Объем: " + box3D.volume());



    }
}
