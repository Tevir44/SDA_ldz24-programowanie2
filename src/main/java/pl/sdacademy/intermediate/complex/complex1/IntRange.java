package pl.sdacademy.intermediate.complex.complex1;

class IntRange {

    private int max;
    private int min;

    boolean contains (int num){
        return num > min && num < max;
    }
}
