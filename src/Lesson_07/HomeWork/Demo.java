package Lesson_07.HomeWork;

import java.util.Date;

public class Demo {

    //Объекты Deal класса

    /*
В классе Demo создай методы createDeal и createDealAndCallMethods.

1. createDeal должен создавать объект класса Deal с параметрами:

    price = 100
    dateCreated = current
    isConfirmed = false
    dateConfirmed = null
    city = "Dnepr";
    country = "Ukraine"
    type = "Buy"

    и возвращать его

2.  createDealAndCallMethods должен создавать объект класса Deal с параметрами:

    price = 100
    dateCreated = current
    isConfirmed = true
    dateConfirmed = current
    city = "Kiev"
    country = "Ukraine"
    type = "SomeValue"

    createDealAndCallMethods должен вызывать всем методы с класса Deal через его
    объект и возвращать созданный (не СОЗДЫННЫЙ)объект

Методы должны быть публичными, используем ключевое слово public.
В этой и во всех следующих задачах обязательно делай форматирование (выравнивание кода)
в своей IDE (Ctrl+Alt+L)

     */

    public Deal createDeal() {
        Deal object1 = new Deal(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
        return object1;
    }

    public Deal createDealAndCallMethods() {
        Deal object2 = new Deal(100, new Date(), true, new Date(), "Kiev", "Ukrain", "SomeValue");
        object2.checkPrice();
        object2.confirmDeal();
        object2.isValidType();

        return object2;
    }


}
