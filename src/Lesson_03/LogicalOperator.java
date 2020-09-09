package Lesson_03;

public class LogicalOperator {
    public static void main(String[] args) {

        //Оператор "И":
        System.out.println(true && true); //Только если оба условия верны действие команды будут выполняться
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);


        int test1 = 1000;

        // ! - это логический оператор отрицания указанного условия.
        if (!(test1 < 1000)) {  // Двойные скобки!!!
            System.out.println("!!!!!");
        }

        //Оператор "Или":
        System.out.println(true || true);  //Выполняется!!!
        System.out.println(true || false); //Выполняется
        System.out.println(false || true); //Выполняется
        System.out.println(false || false); //Только если оба условия не верны команда НЕ будет выполнятся



    }
}
