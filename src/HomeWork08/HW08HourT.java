public class HW08HourT {


        public static void main(String[] args) {
            task(1);           // ночь
            task(12);          // утро
            task(21);         // вечер
        }

        public static void task(int hour) {


            if (hour >= 0 && hour <= 23) {

                if (hour >= 5 && hour <= 12) {
                    System.out.println("утро");
                }


                if (hour >= 13 && hour <= 16) {
                    System.out.println("день");
                }


                if (hour >= 17 && hour <= 21) {
                    System.out.println("вечер");
                }


                if ((hour == 22 || hour == 23) || (hour >= 0 && hour <= 4)) {
                    System.out.println("ночь");
                }
            } else {
                System.out.println("сутки 24 часа, от 0 - до 23");
            }



        }
    }



