package lesson22.person;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Батодалаев", "Даши", 16);
        System.out.println(human);
               Teacher teacher = new Teacher("Даньшин", "Андрей", 38,"Астрофизика",90);
        System.out.println(teacher);
//        teacher.setFirstName("Владимир");
//        teacher.setLasName("Пользин");
//        teacher.setAge(54);
//        teacher.setDiscipline("Физика");
//        teacher.setExperience(95);
//        System.out.println(teacher);


        Student student = new Student("Загидулин", "Линар",
                32, "Математика",
                "ММ_220", 90, 95);
        System.out.println(student);

        Graduate graduate1 = new Graduate(student, "Математические вычисления)");
        System.out.println(graduate1);


        Student student1 = new Student(human, "Физика", "Ф-23", 0,0);
        System.out.println(student1);


        Graduate graduate = new Graduate("Шугани", "Сергей", 25,"Сети","ВЫ_11", 80,20,"Защтта песональных данных");
        System.out.println(graduate);
        Specialist specialist = new Specialist(graduate,5);
        System.out.println(specialist);
    }
}



















