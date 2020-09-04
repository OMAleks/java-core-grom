package Lesson_06;

public class Demo {
    public static void main(String[] args) {
        Car carObject = new Car(10000, 2015, "Anton");
        Car car1 = new Car();
        DbConnector connect1 = new DbConnector();


        System.out.println(carObject.color);
        System.out.println(carObject.horsePower);

        System.out.println(carObject.ownerName);

        carObject.horsePower = 100;

        System.out.println(carObject.horsePower);

        carObject.startRun();
        carObject.stopRun();

        carObject.changeOwner("Test");

        System.out.println(carObject.ownerName);



        /*
        Разница при выводе в консоль null или 0 состоит в том, что 0 выводится для примитивных типов данных, а null -
        для сложных типов данных (String - сложный тип данных), если их значения не заданы.
         */

        /*
        Класс - можно рассматривать как сложный тип данных.  Сложные типы данных нужно всегда инициализировать
         */
       User user1 = new User();
       user1.logIn();
       user1.isActive(true);
       user1.increasaAge();

       car1.startRun();
       car1.stopRun();
       car1.changeOwner("Alex");
        System.out.println(car1.ownerName);

        connect1.connect();




        Car carObject2 = null;
        System.out.println(carObject2);
    }
}
