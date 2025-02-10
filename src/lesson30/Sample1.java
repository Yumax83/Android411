package lesson30;

interface Printable{
    //    void print(String st);
    void print();
}

public class Sample1 {
    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Hello, Java!");
        printable.print();
    }
}
