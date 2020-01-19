package pl.sdacademy.intermediate.basic.basic5;

public abstract class Developer {

    protected String name;
    protected String company;
    protected double salary;
    protected abstract void makeCode();

    public Developer(String name, String company, double salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }
}
