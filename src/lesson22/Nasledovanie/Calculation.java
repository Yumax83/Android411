package lesson22.Nasledovanie;

public class Calculation {
    int z;

    public void additional(int x, int y) {
        z = x + y;
        System.out.println("Сумма: " + z);
    }

    public void subtraction(int x, int y){
        z = x - y;
        System.out.println("Разность: " + z);
    }
}
