package Lesson_02r;

import java.sql.SQLOutput;

public class OperatorExample {

    public static void main(String[] args) {

        int a = 100;
        int b = 30;

        int c = a + b; //Оператор + (плюс) . Аналогичено: - (минус), * (умножить), / (поделить) .

        int c1 = a / b; //Целочисленное деление. Результат: деления без остатка. Остаток игнориуется.
                        // (100:30 = 3 и 10 в остатке. Выводится только 3)
                       // Такое деление назыаетя Division = Div

        int c2 = a % b; //деление с остатка, по модулю. Выводится только остаток.
                        //(100 : 30 =  3 и 10 в остатке. Выводится только 10. Целое игнорируется)
                        //Такое деление называется  Modulus = Mod

        System.out.println(c1);
        System.out.println(c2);

        a = a + 1; //Новому значению а присваеваем старое значение а + 1ж
        System.out.println(a); //а= 100 + 1: а = 101
        a++; //increment - болеее удобная форма записи а = а + 1
        System.out.println(a); //a = 101 + 1; a = 102


        a--; //decrement a = a-1;
        System.out.println(a);

        int n;

        n = 10;

        a = a + n; // увеличиваем а не на 1, а на значение n/
        System.out.println(a);
        a+=n; //тоже самое что а = а + n;
        System.out.println(a);

        a -= n; //тоже самое, что a = a - n;
        System.out.println(a);

        a -= 1011; //Можно добавлять не только переменную, но и конкретное число
        System.out.println(a);

        //Аналагично сделаны операторы *+ ; /= ; %= .

        double c3 = (double) 100 / 30; // деление до дробного числа. Выдает результат с точкой.
        System.out.println(c3);




    }

}
