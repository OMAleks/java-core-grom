package Lesson_02;

public class BreakContinueExpample {
    public static void main(String[] args) {

        int test = 10;

        //break example

        /*while (test > 0) {
            System.out.println(test);
            System.out.println("...");
            test --;
            break;
        } */


        //continue example

        while (test > 0) {
            System.out.println(test);
            test --;

            if(test == 5)
                continue;
            System.out.println("...");

        }


        System.out.println("done");

    }
}
