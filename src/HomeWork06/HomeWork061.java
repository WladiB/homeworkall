

public class HomeWork061 {

    public static void main(String[] args) {


        int result = getMonthInSeason(1);
        System.out.println("C 3-5 Месяц ,  Сезон Весна " );

        result = getMonthInSeason(2);
        System.out.println("C 6-8 Месяц ,  Сезон Лето " );

        result = getMonthInSeason(3);
        System.out.println("C 9-11 Месяц , Сезон Осень " );

        result = getMonthInSeason(4);
        System.out.println("C 12-2 Месяц , Сезон Зима " );
    }


    public static int getMonthInSeason(int seasonNumber) {
        int result = 0;
        switch (seasonNumber) {
            case 3:
            case 4:
            case 5:
                result = 1 ;
                break;
            case 6:
            case 7:
            case 8:
                result = 2 ;
                break;
            case 9:
            case 10:
            case 11:
                result = 3 ;
                break;
            case 12:
            case 1:
            case 2:
                result = 4 ;
                break;
            default:
                System.out.println("Месяц " + seasonNumber + " не существует");
                result = -1;
        }

        return result;
    }

}

