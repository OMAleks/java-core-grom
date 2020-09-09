package Lesson_05;

import java.sql.SQLOutput;
import java.util.Arrays;

public class FirstArray1 {
    public static void main (String[] args) {

        int a = 10;
        int b;          //declaration
        b = 20;         // initialization


        //type of array [] name of array  = new type of array [length] of array]

        int [] firstArray = new int [4]; //declaration

        System.out.println( Arrays.toString(firstArray));


        //array name [index] - get array element;
        firstArray [0] = 11;
        firstArray [1] = 200;
        firstArray [2] = -10;

        System.out.println(firstArray [0]);
        System.out.println(firstArray [1]);
        System.out.println(firstArray [2]);

        System.out.println("");

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray [i]);
        }
        System.out.println();
        System.out.println( Arrays.toString(firstArray));

        int c = 10;

        int [] secondArray = {1, 10, 15, 20, -50};
        System.out.println(Arrays.toString (secondArray));


        //for - each
        for (int element : secondArray) {
            System.out.println(element);
        }








    }


}
