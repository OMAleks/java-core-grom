package Lesson_05r;
import java.util.Arrays;

public class BankPractice {
    public static void main(String[] args) {
        // 1. Найти клиентов, баланс банковского счета которых больше 10000

        String [] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina"};
        int [] balances = {100, 500, 8432, 99, 12000, -54, };
        // Важно!! Длина этих массивов должна быть одинакова.

        //Tasks
        /*
        1. Найти клиентов с балансом больше n.
        2. Найти клиентов с отрицательным балансом.
        3. Написать метод пополнения баланса (с комиссией).
        4. Написать метод снятия с баланса (без комиссии).
         */

       // System.out.println(Arrays.toString (findClientByBalance (names, balances, 500)));
        System.out.println(Arrays.toString (findClientsWithNegativeBalance (names, balances)));


             }

 static String [] findClientByBalance (String [] client, int [] balances, int n){
            // String [] results = new String [client.length];
            // 1. Посчитать количество клиентов, чей баланс больше n;
            // 2. Создать массив с длинной, равной этому количествуж
            // 3. Записать в массив значения (имена клиентов с балансом больше n)

    //          1.

    int count = 0;
    for (int balance : balances) {
        if (balance >= n) {
            count++;


        }
    }

    //              2.

    String [] results = new String [count];

    //              3.

    int index2 = 0;
    for (int index1 = 0; index1 < balances.length; index1++){ //index1 должен быть Меньше! balance.length, а не <= !!!
        if (balances [index1] >= n) {
            results [index2] = client [index1];
            index2++;

        }
    }
            return results;
         }
static String [] findClientsWithNegativeBalance (String [] clients, int [] balances) {

    int count2 = 0;
        for (int balance : balances) {
            if (balance < 0) {
            count2++;
            }
        }


        String [] results2 = new String [count2];

        int index2 = 0;
        for (int index1 = 0; index1 < balances.length; index1++)
            if (balances [index1] < 0) {
                results2[index2] = clients [index1];
                index2++;

            }

        return results2;
}
    }

