package Lesson_05;
import java.util.Arrays;

public class BanksPractice {

    // Важно!! В программировании не должно быть кода, который дублируется!!
    // Важно!! В программировании не должно быть кода. который не используется!!

    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina"};
        int[] balances = {100, 500, 8432, -2147483648, 12000, -54};
        int n = 200;
        System.out.println (Arrays.toString (findClientsByNegativeBalance (names, balances)));
        System.out.println (Arrays.toString (findClientsByBalanceN (names, balances, n)));

        depositMoney (names, balances, "Ann", 1000);
        System.out.println(Arrays.toString (balances));
        System.out.println(withdraw (names, balances, "Andrey", 10));

    }

        //Найти клиентов с балансом больше n
        //Найти клиентов с отрицательнім балансом
        // Метод пополнения баланса (с комиссией)
        // Метод снятия баланса


    //Найти клиентов с балансом больше или равным числу n
    static String [] findClientsByBalanceN (String [] clients, int [] balances, int n) {


        int count = 0;

        for (int balance : balances) {
            if (balance >= n) {
                count++;
            }
        }

        String [] results = new String [count];
        int index1 = 0;
        int index2 = 0;
        for (int balance : balances) {
            if (balance >= n) {
                results[index1] = clients[index2];
                index1++;
            }

            index2++;
        }
        return results;
    }




    //Найти клиентов с отрицательным балансом
    static String [] findClientsByNegativeBalance (String [] clients, int [] balances) {


        int count = 0;

        for (int balance : balances) {
            if (balance < 0) {
                count++;
            }
        }

        String [] results = new String [count];

        int index1 = 0;
        int index2 = 0;
        for (int balance : balances) {
            if (balance < 0) {
                results[index1] = clients[index2];
                index1++;
            }

            index2++;
        }
        return results;
    }


/*
Мтод пополнения баланса с комиссией
    <=100 комиссия = 2%
    > 100 комиссия = 1%

    Для этого нужно (алгоритм решения):
        1. Найти клиента в базе ( в нашем случае в массивах). То-есть определить индекс, зная имя.
        2. Посчитать сумму пополнения с учетом комиссии (от суммы отнять комиссию).
        3. Обновить баланс (пополнить): Пополнение существующего баланса на сумму с вычитом комиссии.
             */

static void  depositMoney (String [] clients, int [] balances, String client, int money) {
/*
    //1.
    int clientIndex = 0;
    for (String cl : clients) {
        if (cl == client) {         //Работае при условии, что имена в массиве не повторяются
            break;
        }
        clientIndex++;
    }


    //2.
    int moneyToDeposit = money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01); // (int) (выражение) - округление результата до int

    //3.
    balances[clientIndex] += moneyToDeposit;

*/

/*
//1.
  int clientIndex =  findClientIndexByName (clients, client);

//2.
    int moneyToDeposit = calculateDepositAmountAfterComission (money);

//3.
    balances[clientIndex] += moneyToDeposit;
*/

balances [findClientIndexByName (clients, client)] += calculateDepositAmountAfterComission (money);


}


static int  findClientIndexByName (String [] clients, String client) {

    int clientIndex = 0;
    for (String cl : clients) {
        if (cl == client) {         //Работае при условии, что имена в массиве не повторяются
            break;
        }
        clientIndex++;
    }
    return clientIndex;

}


static int calculateDepositAmountAfterComission (int money) {
return   money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
}



    static int withdraw (String [] clients, int [] balances, String client, int amount) {

    //1. Находим индекс клиента в массиве по имени.

        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
    //2. Вычисляем остаток на счету.

int result;

        if (balances [clientIndex] > 0 && (balances [clientIndex] - amount) >= 0) {
            balances[clientIndex] = balances[clientIndex] - amount;
            result = balances [clientIndex];
        }
        else {
         result = -1;
                }

    return result;
    }
















}
