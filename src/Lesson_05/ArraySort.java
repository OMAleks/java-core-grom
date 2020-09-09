package Lesson_05;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        System.out.println("Сортировка массива по убыванию: ");
        int[] price = {10, 30, 8, 4, 56};
       // System.out.println(Arrays.toString(sortAscending(price)));
        //System.out.println(Arrays.toString(sortDescending2(price)));
       System.out.println(Arrays.toString(sortDescending(price)));
    }


    /*
    Напишите два метода, которые будут сортировать массив в порядке возрастания и убывания соответственно.
    Возвращаемое значение - отсортированный массив


Сигнатура методов:
int[] sortAscending(int[] array)
int[] sortDescending(int[] array)

Методы должны находиться в классе, название класса не важно

P.S. сортировку массива на практике с нуля пишут крайне мало, почти никогда. Написать ее с нуля для новичка
тоже не простая задача. Поэтому в задании приемлемо если вы найдете решение в интернете, предварительно
разберетесь в нем и проверите на сайте
     */


    /*
    Алгоритм решения.

    1) Сравнить первый элемент массива с другими элементами.
    2) Если другой элемент окажется больше (меньше) первого элемента, то поменять их значения местами.
       Для этого можно использовать переменную, как посредник.
    3) Проводить подобные сравнения до тех пор, пока первый элемент не сравнится с последним.
    4) Повторить последовательность действий 1-3, но уже начиная со следующего (второго и так далее) элемента.
    5) Вернуть измененный массив.

    Пробуем.
     */

    //Длительный (не оптимальный) вариант:

    public static int [] sortAscending (int [] array) {
        int n;
        int i = 1;
        int k =0;

        for (int index1 = k; index1 < array.length; index1++) {

            for (int index2 = i; index2 < array.length; index2++) {

                if (array[index1] < array[index2]) {
                    n = array[index1];
                    array[index1] = array[index2];
                    array[index2] = n;
                    i = 0;


                }

            }

        }

        return array;
    }


   /*Быстрый (оптимальный) альтернативный вариант решения:

    public static int[] sortDescending2(int[] array) {
        int n;
        int i = 1;
        int k = 0;

        for (int index1 = k; index1 < array.length; index1++) {

            for (int index2 = i; index2 < (array.length); index2++) {

                if (array[index1] < array[index2]) {
                    n = array[index1];
                    array[index1] = array[index2];
                    array[index2] = n;
                    i = index1+1;


                }

            }

        }
        return array;
    }
*/

    public static int[] sortDescending(int[] array) {
        int n = array.length;
        int temp;


        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {

                if (array[j - 1] < array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }

            }
        }

        return array;
    }
}
