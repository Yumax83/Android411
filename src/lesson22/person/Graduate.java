package lesson22.person;

public class Graduate extends Student{
private String subject;

    public Graduate(String lasName, String firstName, int age, String speciality, String group, double rating, double attendance, String subject) {
        super(lasName, firstName, age, speciality, group, rating, attendance);
        //this.subject = subject;
        setSubject(subject);
        System.out.println("GraduateConstructor:\t" + Integer.toHexString(hashCode()));
    }
public Graduate(Student student, String subject){
        super(student);
    setSubject(subject);
    System.out.println("GraduateConstructor:\t" + Integer.toHexString(hashCode()));
}
public Graduate(Graduate other){
    super(other);
    this.subject= other.subject;

}
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString()+"Graduate{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
