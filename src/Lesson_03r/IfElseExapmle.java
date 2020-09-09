package Lesson_03r;

public class IfElseExapmle {
    public static void main(String[] args) {
        int test = 1000;

        if (test > 100) {
            System.out.println("Good");
        }
        else {
            System.out.println("Bad");
        }

        // if (condition) { !! condition должно иметь буленское значение!!!
        // if-body (condition = true)
        //}
        // else {
        // else-body (condition = false)
        //}

        // Внимание!! Можно обходиться без фигурных скобок, если тело ифа или тело элсэ
        // составляет одну строку (содержит одно выражение).

        if (test < 100)
            System.out.println("Good");
        else
            System.out.println("Bad");

        if (test > 100) {
            System.out.println("Good");
            System.out.println("...");
        }
        else {
            System.out.println("Bad");
            System.out.println("...");
        }

        // Можно создать буленскую переменную и встаеить ее в условие. Можно просто в условие
        // вставить true или false

        int test1 = 1000;
        boolean result = false;


        if (test1 > 1000) { //if можно использовать без else
            result = true;
        }


        if (result )                     // !! Внимание!! Если в условии стоит буленовская переменная без выражения,
                                        // то это равнозначно условию, что переменная == true
            System.out.println("Nice"); // Если условие (значение переменной result) == true
        else
            System.out.println("Not nice"); // Если условие (значение переменной result) == false

        //Логические операторы

        // Л. О. - это И, ИЛИ, НЕ. (Обозначается: && , || , ! )

        //Более сложный и полный синтаксис if:
        // if (condition - logical operator - condition2...) { !!Лог. Оп. желательно!! не больше 3х)
        // if-body (condition = true)
        //}
        // else {
        // else-body (condition = false)
        //}


        if (result && test1 > 100 && test > 500) { // Если result == true И test1 > 100 И test > 500 (все
                                                  // условия должны быть верны)
            System.out.println("!"); // result == false, поэтому знак восклицания не выводится
        }
        else {
            System.out.println("?"); // Условие не соблюдено, поэтому знак вопроса будет выводиться
        }

        if (result && test1 > 100 || test > 500) { // Условие И не соблюдено (result == false), но условие
                                                   // ИЛИ соблюдается (test > 500). Если в условии хотя бы
                                                   // один логический оператор выдает true, то оно считается true)

            System.out.println("!");    //test > 500, поєтому знак восклицания будет выводиться
        }
        else {
            System.out.println("/");
            }

        if (!(test1 > 0)) {                 //test1 > 0, но лог. оператор "Не" превращает условие в <= 0
            System.out.println("!!!!!");    // поэтому знаки восклицания не будут выводиться
        }


        }


    }



