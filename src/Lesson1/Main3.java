package Lesson1;

public class Main3 {
    public static void main(String[] args) {
MyMathClass m =new MyMathClass();
        int i = 10, j = 15;
        m.sum(i, j);

        float f1 = 3.4f, f2= 9.23f;
        m.sum(f1, f2);

        char c1 = 'a', c2='b';
        m.sum(c1, c2);

    }
}
class MyMathClass {
    public void sum(int i1, int i2){
        System.out.println(":int");
    }
    public void sum(String str1, String str2){
        System.out.println(":String");
    }
    public void sum(double d1, double d2){
        System.out.println(":double");
    }
}

