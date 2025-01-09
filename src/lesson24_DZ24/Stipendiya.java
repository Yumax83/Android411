package lesson24_DZ24;

public class Stipendiya {
    public static void main(String[] args) {
        Student stud1 = new Student("Виктор Вербов", "Gr111", 5);
        stud1.Show();
        Aspirant aspir1 = new Aspirant("Александр Невзоров", "Gr222", "Work1", 4);
        aspir1.Show();
        Aspirant aspir2 = new Aspirant("Антон Бобров", "Gr333", "Work2", 5);
        aspir2.Show();
    }
}

class Student {
    private String fio;
    private String group;
    private int av;

    public Student(String fio, String group, int av) {
        this.av = av;
        this.fio = fio;
        this.group = group;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void Show() {
        System.out.printf("\n%-2s, группа: %-2s, сумма стипендии: %d",
                fio, group, Cash());
    }

    public int Cash() {
        if (av == 5) {
            return 1000;
        } else {
            return 800;
        }
    }
}

class Aspirant extends Student {
    private String tema;

    public Aspirant(String fio, String group, String tema, int av) {
        super(fio, group, av);
        this.tema = tema;
    }

    @Override
    public int Cash() {
        return super.Cash();
    }

    @Override
    public void Show() {
        System.out.printf("\n%-2s, группа: %-2s, тема работы: %-2s, сумма стипендии: %d",
                getFio(), getGroup(), tema, Cash() + 1000);
    }
}




