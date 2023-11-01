package HomeWork17_1;

public class ApplicationC {

        public static void main(String[] args) {

            // Создаем экземпляры класса Cube
            Cube cube1 = new Cube(10);
            Cube cube2 = new Cube(20);
            Cube cube3 = new Cube(30);

            // Вычисляем площадь и объем для каждого экземпляра
            System.out.println("Куб 1:");
            System.out.println("Площадь: " + cube1.getArea());
            System.out.println("Объем: " + cube1.getVolume());
            System.out.println();

            System.out.println("Куб 2:");
            System.out.println("Площадь: " + cube2.getArea());
            System.out.println("Объем: " + cube2.getVolume());
            System.out.println();

            System.out.println("Куб 3:");
            System.out.println("Площадь: " + cube3.getArea());
            System.out.println("Объем: " + cube3.getVolume());
        }
    }








