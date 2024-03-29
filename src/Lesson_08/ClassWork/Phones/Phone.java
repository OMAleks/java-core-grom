package Lesson_08.ClassWork.Phones;

/*
    Обїектно-ориентированное программирование (ООП) - Это методология программирования,
    основанная на представлении программы в виде совокупности объектов, каждый из которых
    является экземпляром определенного класса, а классы образуют иерархию наследования.

    В ООП можно выделить следующие ключевые понятия или принципы: Объект, Класс, Полиморфизм,
    Иерархия,  Инкапсуляция, Абстракция данных, Сокрытие данных. In English: Object, Class,
    Polymorphism, Inheritance, Encapsulation, Data Abstraction, Information Hiding.

     //Внимание!! Одно из ключевых правил хорошего программирования:
     //"Код не должен повторяться вообще!"

     Наследование - это методология, которая позволяет нам перенести свойства и поведение с одного
     класса в другой. При сложной иеарархии это позволяет не прописывать постоянно те свойства и
     методы, которые являются обязательными и общими для всех классов, находящихся  ниже. Мы просто
     указываем, что класс, уже обладающий этими характеристиками, является родительским
     (стоящим выше по иерархии) по отношению к текущему, а значит в текущий класс автоматически
     будут включаться поля и методы родительского класса.
 */

   /*
   Чтобы использоватьс возможности иерархии (наследования), в конце объявления
   дочернего класса используется служебное слово extends и затем название (указание)
   родительского класса. В таком случае будет считаться, что дочерний класс имеет
   все поля и методы родительского. Это позволяет избежать многократного повторения
   кода в дочерних классах.
    */

public class Phone {
    int price;
    double weight;
    String countryProduced;

    public Phone(int price, double weight, String countryProduced) {
        System.out.println("Phone constructor was invoked... ");
        this.price = price;
        this.weight = weight;
        this.countryProduced = countryProduced;
    }

    void orderPhone() {
        System.out.println("order phone invoked...");
    }
}
















































