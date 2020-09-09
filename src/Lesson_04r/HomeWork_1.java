package Lesson_04r;

public class HomeWork_1 {
    public static void main(String[] args) {

        System.out.printf(concat ("I ", "love ", "you"));

    }

    /* 1. Метод на конкатенацию строк.

    Написать метод, который будет принимать три параметра String типа и возвращать
    результат их конкатенации. Название метода - ooncat. Метод должен содержаться в классе.
    Название класса не имеет значения.*/


    public static String concat (String a, String b, String c) {

        return a + b + c;
    }


}
