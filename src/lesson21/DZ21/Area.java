package lesson21.DZ21;

public class Area {
    private static int count;

    public static double triangleArea1(int a, int b, int c) {
        double p = (a + b + c) / 2.;
        count++;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double triangleArea2(int a, int h) {
        count++;
        return 0.5 * a * h;
    }

    public static double squareArea1(int a) {
        count++;
        return Math.pow(a,2);
    }

    public static double rectangleArea(int a, int b) {
        count++;
        return a * b;
    }

    public static int getCount() {
        return count;
    }

}
