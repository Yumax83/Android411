package Lesson20;

public class Program {
    public static void main(String[] args) {
        // создать экземпляр класса
//        Person p1 = new Person();
//        p1.displayInfo();
//        p1.name = "Irina";
//        p1.age = 28;
        //System.out.println(p1.name);
//        Person p2 = new Person("Валентин");
//        p2.displayInfo();

        // p3.name = "Валерий";
        //  p3.setName("Валерий");
        //  System.out.println(p3.getName());
        //p3.age=20; не работает
        //System.out.println(p3.name);
        // p3.setAge(16);
        // p3.setAge(258);
        Person p3 = new Person("Марина", 25);
        p3.displayInfo();

//        Person n = new Person();
//        n.displayInfo();

    }
}

class Person {
    //public String name; // свойства
    private String name;
    private int age;

    {
        name = "неизвестно";
        age = 18;
    }

    public Person() {
        //this("неизвестно", 18);

//        name = "неизвестно";
//        age = 18;
    }

    public Person(String n) {
        //this (n, 18);
      //  this.name = n;

    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s%nAge: %d%n", name, age);
    }

}
