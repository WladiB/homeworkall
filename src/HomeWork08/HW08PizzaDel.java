public class HW08PizzaDel {


        public static void main(String[] args) {


            task1(1);
            task1(20);
            task1( 5);
        }

        public static void task1(int delRadius) {

            if (delRadius >= 1 && delRadius <= 3) {
                System.out.println("Заказ и доставка от 30€");
            } else if (delRadius >= 4 && delRadius <= 8) {
                System.out.println("Заказ и доставка от 40€");
            } else if (delRadius >= 9 && delRadius <=15) {
                System.out.println("Заказ и доставка от 50€");
            } else {
                System.out.println("Доставка  для постоянных Клиентов без ограничений");
            }
        }

    }


