package pl.sdacademy.intermediate.warmup.warmup2;

public class Main {
    public static int getSumOfElementsLengths(String[] array){
        int sum = 0;
        for (String s : array){
            sum += s.length();
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] array = new String[] { "abc", "cde", "efghijk", "lmnopr", "st", "u", "vwxyz" };

        System.out.printf("Sum of lengths of all elements: %d", getSumOfElementsLengths(array));
    }
}
