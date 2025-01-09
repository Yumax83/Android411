package Lesson20.personal_data;

public class Human {
    private String name;
    private String birthday;
    private String phone;
    private String country;
    private String city;
    private String adress;

    Human() {
    }

//    public Human(String firstName, String birthday, String phone, String country, String city, String adress) {
//        this.name = firstName;
//        this.birthday = birthday;
//        this.phone = phone;
//        this.country = country;
//        this.city = city;
//        this.adress = adress;

    public Human(String name, String adress, String city, String country, String phone, String birthday) {
        this.name = name;
        this.adress = adress;
        this.city = city;
        this.country = country;
        this.phone = phone;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void printInfo() {
        System.out.println("********* Персональные данные ********");
        System.out.println("Имя: " + this.name);
        System.out.println("Дата рождения: " + this.birthday);
        System.out.println("Номер телефона: " + this.phone);
        System.out.println("Страна: " + this.country);
        System.out.println("Город: " + this.city);
        System.out.println("Домашний адрес: " + this.adress);
        System.out.println("======================================");

    }
}























