package Lesson_04;

public class HomeCompareSum { //Сравнение двух сумм и вывод true если 1-ая сумма больше и false если иначе.

    public static void main(String[] args) {
        boolean result = compareSums (5,10,5,10);
        System.out.println(result);
    }

    public  static boolean compareSums (int a, int b, int c, int d) {

        long sum1 = sum(a, b);
        System.out.println("First sum is " + sum1);

        long sum2 = sum(c, d);
        System.out.println("Second sum is " + sum2);

        boolean res = sum1 > sum2 ? true : false;

        return  res;
    }


    public  static long sum (int from, int to) {
       long summa = 0;
       for (long i = from; i <= to; i++) {
           summa += i;
       }

        return summa;
    }
}
