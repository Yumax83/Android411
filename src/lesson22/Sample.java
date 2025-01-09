package lesson22;

public class Sample {
    public static void main(String[] args) {
        Outer out = new Outer("внешний");
        System.out.println(out.name);
        //Outer.Inner in =new Outer.Inner("внутренний"); - НЕ ПРАВИЛЬНО
        // Правильно
        System.out.println(out.inner.innerName);
        // к Inner - у
        System.out.println(Outer.Inner.age);
        Outer.Inner.info(); // так к статическому
        out.inner.func(); // так к динамическому только через экземпляр класса

    }
}

class Outer {
    String name;
    // ПРАВИЛЬНО
    Inner inner;
    public Outer(String name) {
        this.name = name;
      inner = new Inner("внутренний");

    }

    class Inner {
        static int age;
        String innerName;

        static {
            age = 18;
        }

        public Inner(String innerName) {
            this.innerName = innerName;
        }

        public static void info() {
            System.out.println("Статический метод");
        }

        public void func() {
            System.out.println("Метод во вложенном классе");
        }
    }
}
