package Lesson_04r;

public class HomeWork_2 {

    public static void main(String[] args) {
        short y = 1;
        short z = 6;
        int x = 2;

        System.out.println(findDivCount (y, z, x));

    }

        /*
         2.   Кратные на промежутке.

             Напишите метод, который на промежутке [a, b] будет находить количество чисел, которые
             кратны числу n. Сигнатура метода: findDivCount (short a, short b, int n). n>0. 0<=a<=b.
         */


            public static int findDivCount (short a, short b, int n) {

                int res = 0;

                for (int i = a; i <= b; i++) {

                    if (i % n == 0)
                        res++;

                }

                return res;
            }
}
