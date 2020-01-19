package pl.sdacademy.intermediate.basic.basic2;

import java.time.LocalDateTime;

public class Person {
    private final String name;
    private final String surname;
    private final String placeOfBirth;
    private int age;
    private long phone;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public int getAge() {
        return age;
    }

    public long getPhone() {
        return phone;
    }

    public Person(String name, String surname, String placeOfBirth, int age, long phone) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        int yearOfBirth = LocalDateTime.now().getYear() - age;
//        return name + " " + surname + " (ur. " + yearOfBirth + " r.)\n"
//                + "m. ur.: " + placeOfBirth + "\n"
//                + "tel: " + phone;
        return String.format("%s %s (ur. %d r.)\nm.ur.: %s\ntel: %d\n", name, surname, yearOfBirth, placeOfBirth,phone);
    }
}
