package Lesson_06;

import java.util.Date;

public class HomeWorkDeal {

    /*
     Представьте, что вs разрабатываете ресурс, где люди могут заключать сделки про продаже-покупке
     недвижимости. Для такого ресурса нужно будет создать сущность (класс) Deal, которая будет
     отображать и хранить данные о сделках. Создайте этот класс и доавьте в него следующиее

     Поля:

         long id
         int price
         Date dateCreated
         boolean isConfirmed
         Date dateConfirmed
         String city
         String country
         String type

     Создайте два конструктора:

          1) который будет использовать все поля, кроме id
          2) пустой

      Создайте методы:

        confirmOrder - должен проставлять ордер в статус confirmed = true и дату конфирма
            ставить в текущую

        checkPrice - должен возвращать true, если цена сделки больше 1000 и false в другом случае.

        isValidType - type поле может принимать только два значения - Buy, Sale - метод возвращает
            true если это требование выполняется и false - если нет.


     */

    public static void main(String[] args) {
        System.out.println("Теперь все должно получиться");
    }
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public HomeWorkDeal(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public HomeWorkDeal() {
    }

    public void confirmOrder(){
        isConfirmed = true;
        dateCreated = new Date();
    }

    public boolean checkPrice(){
        boolean check;
        if (price > 1000)
            check = true;
        else
            check = false;

      return check;
    }

    public boolean isValidType(){
        boolean valid;
        if (type == "Buy" || type == "Sale")
            valid = true;
        else
            valid = false;

        return valid;
    }
}
