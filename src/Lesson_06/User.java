package Lesson_06;

import java.util.Date;

public class User {
    String name;
    int age;
    String city;
    Date lastActiveDate;
    boolean isActive;

    public static void main(String[] args) {
        System.out.println("I love you");
    }

    // Пустой конструктор:


    public User() {     // Alt+Ins -> Constructor -> Class.name
    }

    // Конструктор со всеми полями:

    public User(String name, int age, String city, Date lastActiveDate, boolean isActive) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.lastActiveDate = lastActiveDate;
        this.isActive = isActive;
    }

    // Конструктор с одним полем:

    public User(String name) {
        this.name = name;
    }

    void logIn() {
        lastActiveDate = new Date(); //метод меняет значение даты входа на сайт на текущее
        //System.out.println(new Date()); //распечатывает в консоль текущую дату

    }

    void isActive(boolean status) {    // Метод определяет активен  пользователь или нет
        isActive = status;
    }

    void increasaAge() {    // Метод на увеличение возраста
        age++;
    }
}
