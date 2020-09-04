package Lesson_06;

import java.util.Date;

public class Temp {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User("Ann", 20, "Kyiv", new Date(), false);

        Car car1 = new Car(20000, 2020, "Andrei");

        DbConnector connect1 = new DbConnector();


        user1.logIn();
        user1.isActive(true);
        user1.increasaAge();

        car1.startRun();
        car1.stopRun();
        car1.changeOwner("Alex");
        System.out.println(car1.ownerName);

        connect1.connect();


    }


}
