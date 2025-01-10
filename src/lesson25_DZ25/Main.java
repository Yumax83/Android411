package lesson25_DZ25;

import lesson25.shaps.Rectangle;
import lesson25.shaps.Shape;
import lesson25.shaps.Square;
import lesson25.shaps.Triangle;

public class Main {
    public static void main(String[] args) {

        Figura[] figures = new Figura[3];
        figures[0] = new Shar(5);
        figures[1] = new Piramida(6, 10);
        figures[2] = new Cilindr(13, 7);

        for (Figura figura : figures) {
            figura.info();
        }
    }
}
