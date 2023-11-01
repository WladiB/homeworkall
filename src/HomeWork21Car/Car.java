package HomeWork21Car;

import java.util.Objects;

public class Car {

    private String make;
    private String model;
    private int year;
    private String vin;
    private java.util.Objects Objects;

    public Car(String make, String model, int year, String vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return make.equals(car.make) &&
                model.equals(car.model) &&
                year == car.year &&
                vin.equals(car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year, vin);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", vin='" + vin + '\'' +
                '}';
    }
}

