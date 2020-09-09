package Lesson_02r;

public class ForLoopExample {
    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {     // Initialization; Condition; Update/
            System.out.println(a);
        }

        System.out.println();

        int a = 1;
        for (; a <= 10;) {              //допустимо не включать инициализации и (или) апдейт
            System.out.println(a);
            a++;
        }

        // for (; ; ) - Если убрать условие оно будет считаться true и цикл будет бесконечным. Недопустимо!



    }
}
