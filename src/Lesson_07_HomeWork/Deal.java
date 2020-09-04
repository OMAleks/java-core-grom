package Lesson_07_HomeWork;

import java.util.Date;

public class Deal {
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public Deal() {
    }

    public Deal(int price, Date dataCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dataCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }


    public void confirmOrder() {
        isConfirmed = true;
        dateConfirmed = new Date();
    }

    public boolean checkPrice() {
        return price > 1000;
    }

    public boolean isValidType() {
        return type == "Buy" || type == "Sale";
    }


}
