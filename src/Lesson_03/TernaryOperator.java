package Lesson_03;

public class TernaryOperator {
    public static void main(String[] args) {
        int a;
        byte b = 100;

        //lets solve
        //a = 500 if b > 200
        //a = 350 if b <= 200


        //bad solution
       /* if (b > 200) {
            a = 500;
        } else {
            a = 350;
        } */

       //good solution:
        a = b > 200 ? 500 : 350; // Без if !!; ? - "то присвоить"; : - "иначе присвоить"
        System.out.println(a);

       //more complicated example:
       a = b > 200 ? 500 : b - 500;
        System.out.println(a);
    }
}
