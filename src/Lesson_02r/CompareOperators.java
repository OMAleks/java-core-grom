package Lesson_02r;

public class CompareOperators {
    public static void main(String[] args) {
        //Comparison operators(Операторы сравнения):
        //< > <= >= == =!   -  меньше, больше, меньше или равно, больше или равно, равно, не равно
        //Результатом всегда будут булевские значения : true лли false (верно или не верно)

        int a = 100;
        int b = -1;

        boolean res = a < b;           //100 меньше -1
        System.out.println(res);
        System.out.println(a < b);

        //В Джаве симовл = отличается от == .
        //Одинарное = означает "присвоить значение", а двоейное равно == означает оператор сравнения

        int a2 = 100;
        int b2 = 100;
        res = a2 == b2;             //100 равно 100
        System.out.println(res);

        res = a2 != b2;             //100 не равно 100
        System.out.println(res);

        a2 = 100;
        b2 = -100;

        res = a2 != b2;             //100 не равно -100
        System.out.println(res);



    }
}
