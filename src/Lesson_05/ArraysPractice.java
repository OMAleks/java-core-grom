package Lesson_05;

public class ArraysPractice {

    public static void main(String[] args) {

        int [] array = {-10, 0, 110, 555, 1000, -45, 0, 60, 10};

        System.out.println(maxElement(array));
        System.out.println(nCount (array,0));


    }



        public static int maxElement ( int[] array){

            int max = array[0];
            for (int el : array) {
                if (max < el) {
                    max = el;
                }
            }
            return max;
        }




        public static int nCount(int [] array2, int n) {


         int count = 0;

         for (int el : array2) {
             if (el == n) {
                 count++;
             }
         }
         return count;
        }


    }



