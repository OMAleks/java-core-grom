package Lesson_03r;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println(true && true);   //true
        System.out.println(true && false);  //false
        System.out.println(false && true);  //false
        System.out.println(false && false); //false

        System.out.println();

        //Выражение с логическим оператором И (&&) верно только тогда, когда оба условия истинны

        System.out.println(true || true);   //true
        System.out.println(true || false);  //true
        System.out.println(false || true);  //true
        System.out.println(false || false); //false

        System.out.println();

        //Выражение с логическим оператором ИЛИ (||) верно тогда, когда хотя бы одно из условий истинно

        System.out.println(! true);  //false        Синткаксис: if (! (test1 > 0) ) {...
        System.out.println(! false);  //true

        //Выражение с логическим оператором НЕ (!) меняет правду на ложь и наоборот



    }
}
