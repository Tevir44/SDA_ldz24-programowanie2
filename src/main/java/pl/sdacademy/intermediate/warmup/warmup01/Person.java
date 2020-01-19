package pl.sdacademy.intermediate.warmup.warmup01;

import java.time.LocalDateTime;

public class Person {
    final String name;
    final String surname;
    final String placeOfBirth;
    int age;
    long phone;

    public Person(String name, String surname, String placeOfBirth) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
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
        return String.format("%s %s (ur. %d r.)\nm.ur.: %s\ntel: %d", name, surname, yearOfBirth, placeOfBirth,phone);
    }
}
