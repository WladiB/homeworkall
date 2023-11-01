package HomeWork05;

//Задача 1. Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника
// - любая из сторон должна быть меньше суммы двух
// других. Сообщить результат - существует
// или нет треугольник с заданными сторонами.

public class HomeWork05 {

    public static void main(String[]args) {
        double sideA = 4.1;
        double sideB = 5.2;
        double sideC = 6.3;

        String result = checkTriangle(sideA, sideB, sideC);

        System.out.println("Для сторон:" + sideA + sideB +sideC);//1,2,3 -не существует

        result= checkTriangle(2,3,4);
        System.out.println(result);

    }
    public static String checkTriangle( double a, double b,double c){
        String message;
        boolean isASideSort = a < ( b+ c);
        boolean isBSideSort = b < ( a+ c);


        if ( isASideSort & isBSideSort & c <( b+a)) {
            message = "Треугольник существует";

        } else {

            message = "Треугольник не существует";

        }
        return message;





    }
}
