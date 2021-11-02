package Lesson_08.ClassWork.Ads;

import java.util.Date;

public class Ad extends BaseEntity{       //Родительский клас "Объявление"
    int price;
    Date dateCreated;

    public Ad( long id, int price) { //Внимание!! можно задать значение, не указанное в параметрах конструктора!!!
        super(id);
        this.price = price;
        this.dateCreated = new Date();  //постоянно (всегда) задаем текущую дату
    }

    void publishAd() {
        //some logic;
    }


}
