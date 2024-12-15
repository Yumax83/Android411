package lesson22.person;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Батодалаев", "Даши", 16);
        System.out.println(human);
        Student student = new Student("Загидулин", "Линар",
                32, "Математика",
                "ММ_220", 90, 95);
        System.out.println(student);
        Teacher teacher = new Teacher("Даньшин", "Андрей", 38,"Астрофизика",90);
        System.out.println(teacher);
        teacher.setFirstName("Владимир");
        teacher.setLasName("Пользин");
        teacher.setAge(54);
        teacher.setDiscipline("Физика");
        teacher.setExperience(95);
        System.out.println(teacher);

    }
}
