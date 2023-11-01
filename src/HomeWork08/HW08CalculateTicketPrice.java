public class HW08CalculateTicketPrice {

        public static void main(String[] args) {
            int age = 46;

            String category = CalculateTicketPrice(age);

            System.out.println("Ваш возраст: " + age + " лет, " +
                    "вы относитесь к категории: " + category);
        }

        public static String CalculateTicketPrice(int age) {
            if (age > 7 && age < 17) {
                return "VIP Price 10€";
            }    if (age > 30 && age < 45){
                return "Стандартный Price 5€";
            } else if (age > 18 && age < 29) {
                return "Студенческий Price 8€";
            } else if (age > 45 && age < 75) {
                return "Для Пенсионеров Price 9€";
            } else {
                return "Не корректный возраст" ;
            }
        }
    }

