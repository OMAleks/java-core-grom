package Lesson_04;

public class PracticeExample {
    public static void main(String[] args) {
        System.out.println(min (2,5,10));
        System.out.println(min (10,5,2));
        System.out.println(min (10,5,10));

        System.out.println(average (2));
        System.out.println(average (10));

        System.out.println(average (2,5));


        System.out.println(count(2,50,3));


    }





        //Метод вычисления наименьшего числа из трех заданных

   public static int min (int a, int b, int c) {
       int res = a < b ? a : b; //Если а < b то присвоить res значение а, иначе присвоить значение b
       return res < c ? res : c;// Если значение res < c, то вернуть res, инсче вернуть значение с
    }


        //Метод определения среднего арифметического  в промежутке от 1 до n

    public static double average (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {      //? Не рабоатает если ; i == n;
            sum += i;
        }
        return (double) sum / n; // Операто / это целочисленное деление. (double) превращает его в дробное деление
    }                            // Этот прием называется "кастингом" или "кастом типов"


    //Метод определения среднего арифметического  в промежутке от a до b

    public static double average (int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return (double) sum / (b - a + 1);
    }

    //Метод определения количества чисел в промежутке, которые заканчиваются на цифру n

    public static int count (int a, int b, int n) {

        int count = 0;
        for (int i = a; i <= b; i++){
            if (i % 10 == n) {
                count++;
            }
        }

        return count;
    }

}
