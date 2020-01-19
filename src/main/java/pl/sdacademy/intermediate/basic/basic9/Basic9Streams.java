package pl.sdacademy.intermediate.basic.basic9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Basic9Streams {

    public static void getMaxOfAllLists(List<List<Integer>> list){
        double result1 = list.stream()
                .flatMap(Collection::stream)
                .mapToDouble(value -> value)
                .max().orElse(0d);
        System.out.println("Max using flatMap: " + result1);

        double result2 = list.stream()
                .mapToDouble(Collections::max)
                .max().orElse(0d);
        System.out.println("Max using map: " + result2);
    }

    public static boolean anyMatch (List<List<Integer>> list){
        System.out.println("AnyMatch");
        Stream <List<List<Integer>>> stream = Stream.of(list);
        int maxOfStreams = stream.flatMap(Collection::stream)
                .map(Collections::max)
                .mapToInt(element -> element)
                .max().orElse(0);

        System.out.println("Max using Stream: " + maxOfStreams);

        return list.stream()
                .flatMapToInt(lists -> lists.stream().mapToInt(element -> element))
                .anyMatch(element -> element % 2 == 0);

    }

    public static Integer anotherMax (List<List<Integer>> list){
        return list.stream()
                .flatMapToInt(lists -> lists
                        .stream()
                        .mapToInt(element -> element))
                .reduce(0,(left, right) -> Integer.max(left,right));

    }

    public static void dictinctNumbers (List<List<Integer>> list){
        long count = list.stream()
                .flatMapToInt(lists -> lists.stream().mapToInt(element -> element))
                .distinct()
                .peek(System.out::println)
                .count();

        System.out.println("liczba elementów po usunięciu powtórzeń " + count);

    }



    public static void main(String[] args) {

        List<Integer> integer1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integer2 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> integer3 = Arrays.asList(111, 7, 13, 2, 14);

        Stream <Integer> stream = integer1.stream();


        List <List<Integer>> list = Arrays.asList(integer1, integer2, integer3);
        getMaxOfAllLists(list);

        if (anyMatch(list)){
            System.out.println("Sa liczby podzielne przez 2");
        } else {
            System.out.println("Nie ma liczb podzielnych przez 2");
        }

        System.out.println("Another version of finding max " + anotherMax(list));
        dictinctNumbers(list);


        System.out.println("Hello World");





    }
}
