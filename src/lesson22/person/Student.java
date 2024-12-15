package lesson22.person;

public class Student extends Human {
    private String speciality;
    private String group;
    private double rating;
    private double attendance;

    public Student(String lasName, String firstName, int age, String speciality,
                   String group, double rating, double attendance) {
        super(lasName, firstName, age);
//        this.attendance = attendance;
//        this.rating = rating;
//        this.group = group;
//        this.speciality = speciality;
        setSpeciality(speciality);
        setGroup(group);
        setRating(rating);
        setAttendance(attendance);
        System.out.println("StudentConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "speciality='" + speciality + '\'' +
                ", group='" + group + '\'' +
                ", rating=" + rating +
                ", attendance=" + attendance +
                '}';
    }
}
