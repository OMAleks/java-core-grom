package Lesson_05r;

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {

        int a;      //declaration
        a = 10;     //initalization

        //type of array [] name_of_array = new type_of_array [length_of_array]
        int [] firstArray = new int [3]; //declaration

        //array_name [index] = get array element
        firstArray [0] = 11;
        firstArray [1] = 200;   //initialization
        firstArray [2] = -10;

        System.out.println(firstArray[2]);
        System.out.println(firstArray[1]);
        System.out.println(firstArray[0]);



    }
}

