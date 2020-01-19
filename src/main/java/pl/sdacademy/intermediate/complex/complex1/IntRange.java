package pl.sdacademy.intermediate.complex.complex1;

class IntRange {

    private int max;
    private int min;

    public IntRange(int min, int max) {
        this.max = max;
        this.min = min;
    }

    boolean contains (int num){
        return num >= min && num <= max;
    }
}
