package Lesson_04;

public class HomeDivCount {
 public static void main(String[] args) {
     short a = 0;
     short b = 10;
     int n = 5;

     int res = findDivCount (a, b, n);


    }




    public static int findDivCount(short a, short b, int n) {
        int result = 0;

        for (int i = a; i <= b; i++) {

            if (i % n == 0) {
                result ++;
            }
        }
        return  result;
    }



}
