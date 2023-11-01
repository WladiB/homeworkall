package Homework18_2;

public class Main {

    public static void main(String[] args) {

        Laptop laptop = new Laptop("Apple", 16, "13.3 inches");

        DesktopComputer desktopComputer = new DesktopComputer("Dell",
                32, "Intel Core i7-13700K",
                "Nvidia GeForce RTX 3080");

        laptop.displayInformation();

        desktopComputer.displayInformation();
    }
}
