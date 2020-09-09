package Lesson_03;

public class IfElseExample {
    public static void main(String[] args) {

        int test = 1000;

        if(test > 100) {
            //Можно задать if (true)
            System.out.println("Good");
            System.out.println("...");
        } else {
            System.out.println("Bad");
            System.out.println("...");
        }

        //if (condition1 - logical operator-condition2..)
        // Хороший код - если условий не больше трех
        // {
        // if-body;
        // }
        //else {
        // else-body;
        // }

/*  Если комнда под if состоит из одной строки, фигурными скобками можно пренебречь:
        if(test < 100)
            System.out.println(" Yet Good");
        else
            System.out.println("Yet Bad");
            System.out.println("...");      */

        int test1 = 1000;
        boolean result = false;



        if(test1 > 1000) {
            result = true;
        }

        if (result)     //упрощенное написание, равноценно выражению:  /if (result == true)/
            System.out.println("nice");
        else System.out.println("not nice");

        if (result && test1 >100 || test > 500) {
            System.out.println("!");
        } else {
            System.out.println("?");
        }



    }
}
