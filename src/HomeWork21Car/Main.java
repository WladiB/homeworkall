package HomeWork21Car;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", 2023, "1234567890123456");
        Car car2 = new Car("Honda", "Civic", 2022, "9876543210987654");
        Car car3 = new Car("Ford", "Galaxy", 2021, "0123456789012345");

        // car1 и car2 не равны, так как у них разные производители
        System.out.println(car1.equals(car2)); // false

// car1 и car3 не равны, так как у них разные года выпуска
        System.out.println(car1.equals(car3)); // false

// car2 и car3 равны, так как у них одинаковые значения всех полей
        System.out.println(car2.equals(car3)); // true

        // hashCode() car1 и car2 разные, так как у них разные значения поля make
        System.out.println(car1.hashCode() == car2.hashCode()); // false

// hashCode() car1 и car3 разные, так как у них разные значения поля year
        System.out.println(car1.hashCode() == car3.hashCode()); // false

// hashCode() car2 и car3 одинаковые, так как у них одинаковые значения всех полей
        System.out.println(car2.hashCode() == car3.hashCode()); // true
        System.out.println(car1); // Car{make='Toyota', model='Corolla', year=2023, vin='1234567890123456'}
        System.out.println(car2); // Car{make='Honda', model='Civic', year=2022, vin='9876543210987654'}
        System.out.println(car3); // Car{make='Ford', model='Mustang', year=2021, vin='0123456789012345'
    }
}

