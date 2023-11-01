public class HomeWork10BirthDeathRates {

        public static void main(String[] args) {

            int popTotal = 14000000;
            int birthRTotal = 14;
            int deathRTotal = 8;
            int yearAll = 10;
            int totalRate = 0;


            for (int year = 1; year <= yearAll; year++) {

                int births = (popTotal * birthRTotal) / 1000;
                int deaths = (popTotal * deathRTotal) / 1000;

                popTotal += (births - deaths);
            }
            System.out.println("Население страны за 10 лет будет равно: " + popTotal);



        }
    }




