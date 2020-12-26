package Lesson_07_HomeWork;
import java.util.Date;

public class Demo2 {
    //write your code here

    public  void createDeal() {
        Deal object1 = new Deal(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
    }

    public  void createOrderAndCallMethods() {
        Deal object2 = new Deal(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
    }

    public Deal createDealAndCallMethods() {
        Deal object3 = new Deal();
        object3.confirmOrder();
        object3.checkPrice();
        object3.isValidType();
        return object3;

    }


}
