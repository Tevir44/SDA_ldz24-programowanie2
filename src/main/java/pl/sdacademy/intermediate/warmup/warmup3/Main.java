package pl.sdacademy.intermediate.warmup.warmup3;

public class Main {
    public static int getMax (int[] array){
        if (array == null || array.length == 0){
            throw new NullPointerException("Array is empty");
        }
        int max = Integer.MIN_VALUE;
        for (int i : array){
            max = i > max ? i : max;
        }
        return max;
    }

    public static int getMin (int[] array){
        if (array == null || array.length == 0){
            throw new NullPointerException("Array is empty");
        }
        int min = Integer.MAX_VALUE;
        for (int i : array){
            min = i < min ? i : min;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] { -2, 3, 1, 23, -9, 0, 12, 6, -4 };

        System.out.printf("Max: %d\n", getMax(array));
        System.out.printf("Min: %d\n", getMin(array));

    }
}
