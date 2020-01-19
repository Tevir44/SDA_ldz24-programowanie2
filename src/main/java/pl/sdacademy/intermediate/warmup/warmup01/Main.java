package pl.sdacademy.intermediate.warmup.warmup01;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Adam", "Smith", "Chicago");
        person1.setAge(28);
        person1.setPhone(784564521);

        Person person2 = new Person("Peter", "Johnson", "New York");
        person2.setAge(18);
        person2.setPhone(214458784);

        System.out.println(person1);
        System.out.println(person2);

    }
}
