package Lesson_08.ClassWork.Phones;

public class IPhone7 extends IPhone {

    boolean isGold; //Мы создали уникальное поле, но не исоплзовали его при создании конструктора:

    public IPhone7(int price, double weight, String countryProduced, boolean fingerPrint) {
        super(price, weight, countryProduced, fingerPrint);
    }

    //Одно и то же служебное слово Super используется для указание наследование как к верхнему по
    //иерархии классу, так и ко всем вышестоящим классам

    /*
    Мы создали конструктор дочернего класса используя исключительно
    конструктор родительского класса (АЛЬТ+Инст - Соп...)
    При двойном и более наследовании дочерний класс наследует все поля, методы и конструторы ВСЕХ
    вышестоящих родительских классов.
     */


}
