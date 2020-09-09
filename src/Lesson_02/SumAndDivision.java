package Lesson_02;

public class SumAndDivision {
    public static void main(String[] args) {
        int n = 1;
        int a = 2;

        while (a <= 1000) {
            n = n + a;
            a++;
        }

        System.out.println(n);

        int x = n / 1234;
        System.out.println(x);

        int y = n % 1234;
        System.out.println(y);

        boolean c = y > x;
        System.out.println(c);
    }


}
