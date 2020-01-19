package pl.sdacademy.intermediate.basic.basic4;

public class Car {
    final private String brand;
    final private String model;
    final private String vin;

    public Car(String brand, String model, String vin) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return vin != null ? vin.equals(car.vin) : car.vin == null;
    }

    @Override
    public int hashCode() {
        return vin != null ? vin.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                '}' + "\n";
    }
}
