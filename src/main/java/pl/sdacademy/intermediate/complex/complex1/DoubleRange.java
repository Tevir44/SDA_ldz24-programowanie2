package pl.sdacademy.intermediate.complex.complex1;

class DoubleRange {
    private double max;
    private double min;

    public DoubleRange(double min, double max) {
        this.max = max;
        this.min = min;
    }

    boolean contains (double num){
        return num >= min && num <= max;
    }
}
