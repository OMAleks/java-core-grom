package Lesson_06;



public class DemoR {
    public static void main(String[] args) {
        Car carObject = new Car(10000, 2015,"Anton");
        System.out.println(carObject.color);
        System.out.println((carObject.horsePower));

        System.out.println((carObject.ownerName));


        /*Мы создали один объект с тремя заданными атрибутами. Однако это не означает, что
        у объекта будут только эти три атрибута и все. Он  содержит в себе все атрибуты класса. Но если их
        значения не указаны, они  будут равны 0 (для примитивных типов даннных - всего 8 типов) или null
        (для переменных сложного типа - не примитивных).
         */

        carObject.color = "Green";
        System.out.println(carObject.color);


        /*Мы можем назначить значение атрибута объекта даже в том случае, если, при создании объекта согласно
        конструктору, атрибут вообще не упоминается как таковой. Затем мы можем использовать атрибут этого
        объекта в коде.
        Тогда возникает вопрос: Зачем нужные конструкторы? Только для того, чтобы задавать значения атрибутов
        класса сразу при создании объекта?
         */
        carObject.startRun();
        carObject.stopRun();

        carObject.changeOwner("Test");
        System.out.println(carObject.ownerName);

        //Так как String  - это сложный, а не примитивный тип данных, то его значение по умолчанию = Null

        Car carObject2 = null;
        System.out.println(carObject2);

        //Клас считают еще и сложным типом данных. Объект типа кар можно названть переменной
        // типа "название класса".





    }
}
