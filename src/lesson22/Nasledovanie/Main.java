package lesson22.Nasledovanie;

public class Main {
    public static void main(String[] args) {
        int a = 20, b = 10;
        MyCalculation calc = new MyCalculation();
        calc.additional(a,b);
        calc.subtraction(a,b);
        calc.multiplication(a,b);

    }
}
