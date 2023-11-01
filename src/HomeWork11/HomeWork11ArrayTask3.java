public class HomeWork11ArrayTask3 {

 // 1. Создайте 2 массива из 5 случайных целых чисел из отрезка от `0` до `5` каждый
  //2. Выведите массивы на экран в двух отдельных строках
  //3. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось
  //больше (либо сообщите, что их средние арифметические равны)
 //


        public static void main(String[] args) {
            int[] mas1 = new int[5];
            int[] mas2 = new int[5];

            for (int i = 0; i < 5; i++) {
                mas1[i] = (int) (Math.random() * 6);
                mas2[i] = (int) (Math.random() * 6);
            }

            printArray(mas1);
            printArray(mas2);

            double sum1 = 0;
            double sum2 = 0;

            for (int i = 0; i < 5; i++) {
                sum1 += mas1[i];
                sum2 += mas2[i];
            }

            double average1 = sum1 / mas1.length;
            double average2 = sum2 / mas1.length;

            if (average1 > average1) {
                System.out.println("Среднее арифметическое первого массива (" + average1 + ") больше среднего арифметического " +
                        "второго массива (" + average2 + ")");
            } else if (average1 < average2) {
                System.out.println("Среднее арифметическое первого массива (" + average1 + ") меньше среднего арифметического " +
                        "второго массива (" + average2 + ")");
            } else {
                System.out.println("Средние арифметические массивов равны (" + average1 + ")");
            }
        }

        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ,");
            }
        }


}
