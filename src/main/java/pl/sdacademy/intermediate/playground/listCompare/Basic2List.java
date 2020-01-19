package pl.sdacademy.intermediate.playground.listCompare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Basic2List {
    public static void showArrayListPerformance(){

        List<Integer> arrayList = new ArrayList<>();
        initList(arrayList);
        long time = System.currentTimeMillis();
        removeFiveThousandsElements(arrayList);
        time = System.currentTimeMillis() - time;
        System.out.printf("Array list took %d to complete the task\n",time);
    }

    public static void showLinkedListPerformance(){
        List<Integer> linkedList = new LinkedList<>();
        initList(linkedList);
        long time = System.currentTimeMillis();
        removeFiveThousandsElements(linkedList);
        time = System.currentTimeMillis() - time;
        System.out.printf("Linked list took %d to complete the task\n",time);
    }

    public static void initList (List<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++){
            list.add(random.nextInt(1000));
        }
    }

    public static void removeFiveThousandsElements (List<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 5000; i++){
            list.remove(random.nextInt(1_000_000 - i));
        }
    }

    public static void main(String[] args) {
        showArrayListPerformance();
        showLinkedListPerformance();

    }
}
