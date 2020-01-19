package pl.sdacademy.intermediate.basic.basic1;

public class BubbleSort {

    public static int[] sortUsingBubbleAlgorithm(int[] array){
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i = 1; i < array.length; i++){
                if (array[i-1]>array[i]){
                    temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
