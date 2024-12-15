package lesson22.person;

public class Teacher extends Human {
private String discipline;
private double experience;

    public Teacher(String lasName, String firstName, int age,
                   String discipline, double experience) {
        super(lasName, firstName, age);
        this.discipline = discipline;
        this.experience = experience;
        System.out.println("TeacherConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + " Teacher{" +
                "discipline='" + discipline + '\'' +
                ", experience=" + experience +
                '}';
    }
}
