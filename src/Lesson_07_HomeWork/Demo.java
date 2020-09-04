package Lesson_07_HomeWork;

import java.util.Date;

public class Demo {


    /*
    1. Начальный код в редакторе ниже.

    2. В классе Demo создайте мтоды createOrder и createOrderAndCallMethods.

    3. createOrder должен создавать объект класса Deal с параметрами -  price = 100,
    dataCreated = текующая, isConfirmed = false, dateConfirmed = null, city = "Dnepr",
    country = "Ukraine", type = "Buy".

    4. createOrderAndCallMethods должен создавать объект класса Deal с параметрами -
    price = 100, dateCreated = текующая, isConfirmed = true, dateConfirmed = текущая,
    city = "Kiev", country = "Ukraine", type = "SomeValue".

    5. createOrderAndCallMethods должен вызывать все методы с класса  через его объект и
    возращать созданный объект

    6. Методы должны быть побличными, используем ключевое слово public. Немного позже
    разебремся с ним в деталях.

    7. В этой и всех следующих задачах обязательно делайте форматирование (выравнивание кода)
    в совей

     */

    public void createOrder() {
        Deal dealObject1 = new Deal(100, new Date(), false, null, "Dnepr", "Ukrain", "Buy");
    }

    public Deal createOrderAndCallMethods() {
        Deal dealObject2 = new Deal(100, new Date(), true, new Date(), "Kiev", "Ukrain", "SomeValue");

        dealObject2.checkPrice();
        dealObject2.confirmOrder();
        dealObject2.isValidType();

        return dealObject2;

    }
}
