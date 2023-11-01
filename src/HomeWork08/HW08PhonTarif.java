public class HW08PhonTarif {


        public static void main(String[] args) {

            // позитивные случаи
            task1(1);       // Эконом
            task1(500);     // Стандарт
            task1(3000);    // Премиум
        }

        public static void task1(int minMinutes) {

            if (minMinutes > 0 && minMinutes < 500) {
                System.out.println("Эконом");
            } else if (minMinutes >= 500 && minMinutes <= 1000) {
                System.out.println("Стандарт");
            } else if (minMinutes > 1000) {
                System.out.println("Премиум");
            } else {
                System.out.println("для вашего запроса нет тарифа");
            }
        }

    }

