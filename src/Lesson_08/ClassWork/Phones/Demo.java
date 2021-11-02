package Lesson_08.ClassWork.Phones;

public class  Demo {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone(110, 10.0, "China", true);
        iPhone.deleteIphoneFromDb();
        iPhone.orderPhone();
    }
}
