package pl.sdacademy.intermediate.basic.basic2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Basic2Lists {
    public static void printList(List<Person> list){
        list.forEach(System.out::print);
    }

    public static void printPeopleOverTwenty(List<Person> list){
        list.stream()
                .filter(element -> element.getAge() > 20)
                .forEach(System.out::print);
    }

    public static void printPeopleWithEvenPhoneNumber(List<Person> list){
        list.stream()
                .filter(element -> element.getPhone() % 2 == 0)
                .forEach(System.out::print);
    }

    public static int getSumOfAges (List<Person> list){
        int sum = 0;
        for (Person person : list){
            sum += person.getAge();
        }
        System.out.printf("Sum of ages of all people is: %d\n", sum);
        return sum;
    }

    public static void removeRandomElementOfList(List<Person> list){
        Random random = new Random();
        list.remove(random.nextInt(list.size()));
    }




    public static void main(String[] args) {
        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person ("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person3 = new Person("Ala", "Makota", "Warszawa", 15, 111222333);
        Person person4 = new Person("Juliusz", "Slowacki", "Krakow", 40, 10203040);
        Person person5 = new Person("Tomasz", "Kowalski", "Lodz", 12, 13342523);

        List<Person> personList = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));

        System.out.println("informacje o wszystkich osobach z listy");
        printList(personList);

        System.out.println("\nosoby, które są starsze niż 20 lat");
        printPeopleOverTwenty(personList);

        System.out.println("\nosoby, których numer telefonu jest podzielny przez 2");
        printPeopleWithEvenPhoneNumber(personList);

        System.out.println(("\nsumę wieku wszystkich osób"));
        getSumOfAges(personList);

        List<Person> personList2 = new ArrayList<>(personList);

        boolean check = personList.equals(personList2);
        System.out.println("********Are lists euqal: " + check);
        removeRandomElementOfList(personList);
         check = personList.equals(personList2);
        System.out.println("********Are lists euqal: " + check);

        System.out.println(("\nsumę wieku wszystkich osób po zmianie"));
        System.out.println("personList");
        getSumOfAges(personList);
        System.out.println("personList2");
        getSumOfAges(personList2);

        System.out.println("personList Length: " + personList.size());
        System.out.println("personList2 Length: " + personList2.size());




    }
}
