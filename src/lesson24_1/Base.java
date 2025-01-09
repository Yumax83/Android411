package lesson24_1;

public class Base {
    public static void main(String[] args) {
        Manager obj1=new Manager();
        System.out.println("Зарплата менеджера: ");
        ptintSalary(obj1);

        Secretary obj2 = new Secretary();
        System.out.println("Зарплата секретаря: ");
        ptintSalary(obj2);
    }
    public static void ptintSalary(Employee obj){
        System.out.println(obj.salary());
    }
}

class Employee {
    public static int base = 10000;

    public int salary() {
        return base;
    }
}

class Manager extends Employee {
    @Override
    public int salary() {
        return super.salary() + 20000;
    }
}

class Secretary extends Employee {
    @Override
    public int salary() {
        return super.salary() + 10000;
    }
}
