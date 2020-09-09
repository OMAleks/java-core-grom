package Lesson_02;

public class SumOfNumbers {

    public static void main(String[] args) {
        long a = 2;
        long n = 1;

        while (a <= 10000000) {

            n = n + a;
            a++;
        }

        System.out.println(n);
    }

}
