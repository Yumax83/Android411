package lesson22.person;

public class Human {
    private String lasName;
    private String firstName;
    private int age;

//    public Human(){
//
//    }

    public Human(String lasName, String firstName, int age) {
        this.lasName = lasName;
        this.firstName = firstName;
        this.age = age;
        System.out.println("HumanConstructor:\t" + Integer.toHexString(hashCode())); // шестнадцатеричное представление
        // хэш кода объекта
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "lasName='" + lasName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
       // return super.toString();
    }
}
