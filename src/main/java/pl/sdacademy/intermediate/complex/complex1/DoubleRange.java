package pl.sdacademy.intermediate.complex.complex1;

class DoubleRange {
    private double max;
    private double min;

    boolean contains (double num){
        return num >= min && num <= max;
    }
}
