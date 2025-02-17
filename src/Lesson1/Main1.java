package Lesson1;

public class Main1 {
    public static void main(String[] args) {
       try{
           throw new B();
       } catch (B exception) {
           B.print();
       }
    }
}

class A extends Exception {
    static public void print() {
        System.out.println("A got caught ");
    }
}
class B extends A {
    static public void print() {
        System.out.println("B got caught");
    }
}

       