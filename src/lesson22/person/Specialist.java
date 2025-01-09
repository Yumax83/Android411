package lesson22.person;

public class Specialist extends Graduate {
int grade;

    public Specialist(String lasName, String firstName, int age, String speciality, String group, double rating, double attendance, String subject, int grade) {
        super(lasName, firstName, age, speciality, group, rating, attendance, subject);
        //this.grade = grade;
        setGrade(grade);
        System.out.println("GraduateConstructor:\t" + Integer.toHexString(hashCode()));
    }
    public Specialist(Graduate graduate, int grade){
super(graduate);
        setGrade(grade);
        System.out.println("GraduateConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() +"Specialist{" +
                "grade='" + grade + '\'' +
                '}';
    }
}
