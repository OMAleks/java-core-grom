package Lesson_08.ClassWork.Phones;

public class IPhone extends Phone{


    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
        super (price, weight,countryProduced);

        System.out.println("IPhoneR constructor was invoked... ");

        this.fingerPrint = fingerPrint;
    }

    void deleteIphoneFromDb(){
        System.out.println("deleteIPhoneFromDb invoked...");

    }


}
