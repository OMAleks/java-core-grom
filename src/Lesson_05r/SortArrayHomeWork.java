package Lesson_05r;

import java.util.Arrays;

public class SortArrayHomeWork {

    /*
    Напишите два метода, которые будут сортировать массив в порядке возрастания и убывания
    соотвественно. Возвращаемое значение - отсортированный массив.
    Сигнатура методов:
        int[] sortAscending(int[] array)
        int[] sortDescending(int[] array)


    Предполагаемый алгоритм решения:

    А) Сравниваю значение первого элемента массива со значениями остальных элементов.
    Б) Если  каой-либо элемент меньше (больше), То меняю значения элементов местами.
    В) Как только обмен совершен, начинаю процесс сравнивания сначала до тех пор, пока не дойду до
       конца массива..
    Г) После сравнения певрого элемента, начинаю сравнивать следующий. Повторяю операции А-В.
    Д) Возвращаю отсортированный массив.
     */
    public static void main(String[] args) {
    int[]numbers = {7,8,13,4,26,15,1,120,24,0,7};
        System.out.println(Arrays.toString(sortAscending(numbers)));
        System.out.println(Arrays.toString(sortDescending(numbers)));

    }

    public static int [] sortAscending(int[] array) {

        int temp;
        for (int k = 0; k < array.length; k++) {

            for (int i = k; i < array.length ; i++ ) {

                if (array [i] < array [k]) {
                    temp = array[k];
                    array [k] = array [i];
                    array[i] = temp;
                    i = k;
                }
            }
        }
        return array;
    }

    public static int[] sortDescending (int[] array){
        int temp;
        for (int k = 0; k < array.length; k++) {
            for (int i = k; i < array.length; i++) {
                if (array[i] > array [k]) {
                    temp = array[k];
                    array[k] = array[i];
                    array[i] = temp;
                    i = k;
                }
            }
        }
        return array;
    }



}
