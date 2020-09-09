package Lesson_03;

public class FindOdd {

    public static void main(String[] args) {

        int i = 1;
        int y = 0;


        while (i <= 1000) {

            if (!(i % 2 == 0)) {    // Определяем нечетное число если остаток от деления на 2 не равен нулю
                System.out.println(i + " Found");
                y = y + i;          // Вычисляем сумму нечетных чисел от 0 до 1000
                                    // Сложение происходит только тогда, когда i - не четное число
            }

            i++;
        }

        System.out.println("Сумма нечетных чисел от 0 до 1000 = " + y);

        if (y * 5 > 5000) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller or equal");
        }

    }


}
