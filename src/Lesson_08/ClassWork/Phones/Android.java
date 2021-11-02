package Lesson_08.ClassWork.Phones;

public class Android extends Phone{ //Служебное слово extends указывает на то, что класс Phone является родительским
    String androidVersion;
    int screenSize;

    String secretDeviseCode;

    //В конструкторе указываем переменные как родительского, так и дочернего класса!

    public Android(int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviseCode) {
       // this.price = price;
       // this.weight = weight;
       // this.countryProduced = countryProduced;
        super(price, weight, countryProduced); //= верхним трем строкам, но с указанием
        // наследования
        /*
         Super = this, но для родительского класса.
         Super с точкой(.)  вызовет в идее списсок всего, что есть в родительском классе.
         В коде выше Super используется для включения родительского конструктора.
         Super можно использовать только при наличии extends - при включени родительского класса.

        this - reference to the current class object
        super - reference to the parent class object

         */
        System.out.println("Android constructor was invoked... ");

        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviseCode = secretDeviseCode;
    }

    void installNewAndroidVersion() {
        System.out.println("installNewAndroidVersion invoked...");
    }

}
