package Lesson_02;

public class LoopExample {
    public static void main(String[] args) {
        // for loop
        // while loop
        // for each loop (!)
        // do while loop

        // 1. while loop

        int a = 10;

        /*System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a); */

       /* while (condition) {
            loop code;
        }*/

        while (a <= 9) {
            System.out.println(a);
            a++;
        }

        /* 2. do while loop
        do {
            loop code;
        } while (conditio) */


        do {
            System.out.println(a);
            a++;
        } while (a <= 11);


    }
}
