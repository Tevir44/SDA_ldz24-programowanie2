package pl.sdacademy.intermediate.basic.basic3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Basic3Maps {
    public static Map<String,Integer> initHashMap(String[] array){
        int temp;
        Map<String,Integer> map = new HashMap<>();
        for (String s : array){
            if (map.containsKey(s)){
                temp = map.get(s);
                map.put(s,temp+1);
            } else {
                map.put(s,1);
            }
        }
        return map;
    }
    public static Map<String,Integer> initLinkedHashMap(String[] array){
        int temp;
        Map<String,Integer> map = new LinkedHashMap<>();
        for (String s : array){
            if (map.containsKey(s)){
                temp = map.get(s);  //można od razu putować po get, bez zmiennej
                map.put(s,temp+1);
            } else {
                map.put(s,1);
            }
        }
        return map;
    }

    public static void printMap (Map<String, Integer> map){
        for (Map.Entry<String, Integer> set : map.entrySet()){
            System.out.println(set.getKey() + " -> " + set.getValue());
        }
    }

    public static void printKeyes(Map<String, Integer> map){
        System.out.println("Map keyes:");
        map.keySet().forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    public static void printValues(Map<String, Integer> map){
        System.out.println("Map values:");
        map.values().forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        String[] array = new String[] { "abc", "abc", "efghijk", "abc", "lmnopr",
                "st", "abc", "u", "vwxyz", "st", "lmnopr", "st", "u", "vwxyz" };

        Map<String,Integer> map = initHashMap(array);
        System.out.println(map.toString());

        Map<String,Integer> map2 = initLinkedHashMap(array);
        System.out.println(map2.toString());

        printMap(map);

        printKeyes(map);
        printValues(map);





    }
}
