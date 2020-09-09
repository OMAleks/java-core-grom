package Lesson_04r;

public class HomeWork_3 {

    public static void main(String[] args) {

        int a = 1;
        int b = 5;
        int c = 10;
        int d = 13;



        System.out.println(compareSums (a, b, c, d));


    }

    /*
  3.  Сравнение сумм.

            Напишите метод, который будет сравнивать сумму чисел на промежутках [a, b], [c, d] включительно
            и возвращать true если первая сумма больше, и false в другом случае.
            Сигнатура метода - compareSums (int a, int b, int c, int d). Для нахождения суммы напишите
            отедльный метод sum (int from, int to), который будете потом использовать.
            Метод должен содержаться в классе. Название класса не важно.
     */

    public static boolean compareSums (int a, int b, int c, int d) {

        long sum1 = sum (a, b);
        long sum2 = sum (c, d);
        boolean result;

        if (sum1 > sum2)
             result = true;
        else
            result = false;


        return result;
    }

    public static long sum (int from, int to) {
        long res = 0;

        for (int i = from; i <= to; i++) {
            res += i;
        }


        return res;
    }
}
