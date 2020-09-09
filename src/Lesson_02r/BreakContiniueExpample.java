package Lesson_02r;

public class BreakContiniueExpample {

    public static void main(String[] args) {

        //break example

     /*   int test = 10;
        while (test > 0) {
            System.out.println(test);
            System.out.println("...");
            test--;
            break;      //break - ключевое (зарезервированное) слово, которое прерывает цикл и дает указание продолжить
                        //программу за циклом
        }
    */

        //continue example
        int b = 10;
        int test = 10;
        while (test > 0) {
            System.out.println(test);
            System.out.println("...");
            test--;
            continue;    //Ключевое словок, которое означает: "прекратить выполнение текущего шага
                         // и перейти к следующему шагу

        }
        System.out.println(b);
        System.out.println("done");
    }
}
