package Lesson_07.ClassWork;

import Lesson_06.Car;

import Lesson_06.DbConnector;
import Lesson_06.User;
import java.util.Date;

public class Temp {

 public static void main(String[] args) {

     User user1 = new User();
     User user2 = new User("Ann", 20, "Kyiv", new Date(), false);

     Car car1 = new Car(20000, 2020, "Andrei");

     DbConnector connect1 = new DbConnector();


 }



    }


