package Lesson_07;


import Lesson_06.Car;

import Lesson_06.DbConnector;
import Lesson_06.User;

public class Demo {

   public static void main(String[] args) {

        /*
                                Two option to create object:
           1. class name (type of object)  object name = new class name;
           2. class name (type of object)  object name = new class name (attributes);
         */

//Для объекта название класса считается сложным типом данных

        User user = new User(); //Каждый объект занимает отдельный блок памяти.
        User user1 = new User(); //Изменения в одном объекте не повлияют на другой.
        User user2 = new User();

        User user3 = new User("Jack"); //Объекты создаются согласно существующим конструкторам!

        Car car = new Car(10000, 2015, "Anton");
        //  Car car1 = new Car(); //Не получится создать объект с пустыми атрибутами, так как в его классе
        // отсутствует конструктор без атрибутов

       DbConnector dbConnectror = new DbConnector();
        /*
        В классе DbConnector не виднео пустого конструктора. Не смотря на это
        Объект создался без ошибок, так как по умолчанию (без написания других конструкторов) во всех
        классах  Джава автоатически создает пустой конструкт. Идея его не показывает. Однако, если мы
        создаем конструктор с атрибутоами, то скрытый пустой конструктор исчезает. Поэтому, чтобы можно
        было создавать объект такого класса без атрибутов, нужно вручную будет прописать пустой
        конструктор.
         */

        /*
        Могут быть клаассы с одинаковым названием. Идея предоставляет возможность из всплывающего меню (Alt + Enter,
        крсор мыши в конце названия класса) выбрать класс из нужного  пакета. Тогда автоматически (а без идеи вручную)
        перед названием класса появляется строка импорта с указанием пакета и названия класса через точку. Например:
        import Lesson_06.Car;
         */



    }

}