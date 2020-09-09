package Lesson_05r;

import java.util.Arrays;

public class UniqueCountHomeWork {

    /*
    1. Напишите метод uniqueCount, который должен находить количество уникальных (не повторяющихся)
        чисел в массиве. Если число поторяется больше одного раза, то его стоит учитывать только
        один раз. Длина входящего массива > 0.

     2. Протестируйте свой код в main методе.

     3. Сигнатура метода:
        public static int uniqueCount(int[] array)

     Пример работы:
        Input: {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11}
        Output: 7

        Объяснение:
        Массив без повторений будет выглядеть так:
        4, 5, 10, 11, 12, 44, 100 - длина 7. Числа 10, 11, 44 повторяются,
        но в ответе учитываются один раз.

     */

    public static void main(String[] args) {

    int[] numbers = {18, 4, 4, 9, 15};
        System.out.println(numbers.length);
        System.out.println(uniqueCount(numbers));
        System.out.println(Arrays.toString(numbers));

    }

    /*
    Предполагаемый алгоритм решения:
    1) Считаем повторение значения первого индекса.
    2) Считаем повторение значнией  остальных элементов. При повторе заменяем их
        значение на значение первого индекса.
    3) Чтобы избежать повторного (избыточного) счета значения первого индекса ставим двойное условие:
        элемент повторяется И не равен значению первого индекса
        ( Логические операторы - это И, ИЛИ, НЕ. Обозначается: && , || , ! )
    4) Из общего количества элементов вычитаем количество повторов первого элемнта и количество повторов
        остальных элементов.
    5) Возвращаем ответ.

     */

    public static int uniqueCount( int[] array){

        int notUniqueMarker = array[0];


        int countFirstElement = 0;
        for (int el : array) {
            if (el == array[0])
                countFirstElement++;
        }
        int firstElementRepeating = countFirstElement - 1;


        int count = 0;
        int temp;
        for(int k = 1; k < array.length; k++){
            for (int i = k; i < array.length-1; i++){
                if (array [k] == array[i+1] && array[k] != notUniqueMarker) {
                    array[k] = notUniqueMarker;
                    count++;

                }

            }
        }
        int notUniqueElementRepeating = firstElementRepeating + count;

        int result = array.length - notUniqueElementRepeating;

        return result;
    }



}
