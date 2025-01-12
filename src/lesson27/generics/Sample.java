package lesson27.generics;

public class Sample {
    public static void main(String[] args) {
        Point<Integer, String> pt = new Point(1,2,"point");
//        Point<Integer> pt = new Point();
//        pt.x = 10;
//        pt.y = 20;
//        System.out.println(pt.x + " " + pt.y);
        //Point<Integer> pt = new Point(1,2);
//        pt.x = 10;
//        pt.y = 20;
        System.out.println(pt.getX() + " " + pt.getY()+" "+pt.getId());

       // Point<Double> pt2 = new Point(10.5, 20.6);
//        pt2.x = 2.1;
//        pt2.y = 2.3;
    //    System.out.println(pt2.getX() + " " + pt2.getY());

//        Point pt3 = new Point();
//        pt3.x = "2.1";
//        pt3.y = "2.3";
//        System.out.println(pt3.x + " " + pt3.y);
    }
}

//class Point <T> { //класс может принимать любой тип данных
//    private T x, y;

    class Point <Tt, V>{
        private Tt x, y;
        private V id;

        public Point(Tt x, Tt y, V id) {
            this.x = x;
            this.y = y;
            this.id = id;
        }

        public Tt getX() {
            return x;
        }

        public Tt getY() {
            return y;
        }

        public V getId() {
            return id;
        }

        //    public Point(T x, T y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public T getX() {
//        return x;
//    }
//
//    public T getY() {
//        return y;
//    }
}
