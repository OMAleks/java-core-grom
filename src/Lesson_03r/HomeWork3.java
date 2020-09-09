package Lesson_03r;

public class HomeWork3 {

    //Нахождение нечетных и их количества

    /*
    На промежутке от нуля до 1000 включительно,
    для каждого нечетного числа выводите в консоль слово Found. Найдите сумму таких чисел.
    Если их сумма, умноженная на 5 больше 5000, выводите в консоль текст Bigger, в другом
    случае выводите текст Smaller ore equal

    Код программы нужно писать в main методе. Название класса - FindOdd.

    Основные требования:

    1. Выводить в консоль слово Found нужное количество раз.
    2. Не выводить в консоль значение суммы.
    3. Выводить верный текст в конце.

     */

    public static void main(String[] args) {

        int z = 0;
        long b;

        for (int i = 1; i <= 1000;i++) {
            b = i%2;

            if (b == 0){
                System.out.println("Found");
                z = z + i;
                }

        }

        if (z * 5 > 5000){
            System.out.println("Bigger");
        }
        else {
            System.out.println("Smaller or equal");
        }
    }

}
