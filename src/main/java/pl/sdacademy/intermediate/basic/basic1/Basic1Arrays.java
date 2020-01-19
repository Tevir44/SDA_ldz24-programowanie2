package pl.sdacademy.intermediate.basic.basic1;

import java.util.Random;

public class Basic1Arrays {
    static final int ARRAYLENGTH = 10;

    public static int[] initTenElementArray(){
        return new int[ARRAYLENGTH];
    }

    public static int[] initBasicArray(){
        int[] array = initTenElementArray();
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        return array;
    }

    public static int[] initFibonacciArray (){
        int[] array = initTenElementArray();
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array;
    }

    private static int[] initRandomArray() {
        int[] array = initTenElementArray();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            array[i] = random.nextInt((30-0)+0);
        }
        return array;
    }


    public static void printArrayInReverseOrder (int[] array){
        StringBuilder result = new StringBuilder("Array elements in reverse order: ");
        for (int i = array.length; i > 0; i--){
            result.append(String.format("%d ",array[i-1]));
        }
        System.out.println(result.toString().trim());
    }

    public static void printOnlyOddElements (int[] array){
        StringBuilder result = new StringBuilder("Odd elements of array: ");
        for (int i : array){
            if (i % 2 != 0){
                result.append(String.format("%d ",i));
            }
        }
        System.out.println(result.toString().trim());
    }

    public static int sumOfElementsOnEvenIndexes (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0){
                sum += array[i];
            }
        }
        System.out.printf("Sum of Array elements on Even indexes: %d\n", sum);
        return sum;
    }

    public static int sumOfElementsHigherThanTen (int[] array){
        int sum = 0;
        for (int i : array){
            if (i > 10){
                sum += i;
            }
        }
        System.out.printf("Sum of Array elements higher than ten: %d\n", sum);
        return sum;
    }

    public static void simplePrint (int[] array){
        System.out.print("Elements of array: ");
        for (int i : array){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] basicArray = initBasicArray();
        printArrayInReverseOrder(basicArray);
        printOnlyOddElements(basicArray);
        sumOfElementsOnEvenIndexes(basicArray);
        sumOfElementsHigherThanTen(basicArray);
        simplePrint(BubbleSort.sortUsingBubbleAlgorithm(basicArray));

        System.out.println();

        int[] fibonacciArray = initFibonacciArray();
        printArrayInReverseOrder(fibonacciArray);
        printOnlyOddElements(fibonacciArray);
        sumOfElementsOnEvenIndexes(fibonacciArray);
        sumOfElementsHigherThanTen(fibonacciArray);
        simplePrint(BubbleSort.sortUsingBubbleAlgorithm(fibonacciArray));

        System.out.println();

        int[] randomArray = initRandomArray();
        printArrayInReverseOrder(randomArray);
        printOnlyOddElements(randomArray);
        sumOfElementsOnEvenIndexes(randomArray);
        sumOfElementsHigherThanTen(randomArray);
        simplePrint(BubbleSort.sortUsingBubbleAlgorithm(randomArray));

    }


}
