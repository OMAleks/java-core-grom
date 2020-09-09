package Lesson_05r;


import java.util.Arrays;

public class BankPractice_r {
    public static void main(String[] args) {

        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(Arrays.toString(findClientsByBalance(names, balances, -100)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));

        depositMoney(names, balances, "Ann", 2000);
        System.out.println(Arrays.toString(balances));



    }

    // Найти клиентов с балансом больше или равным значению n

    public static String[] findClientsByBalance(String[] clients, int[] balances, int n) {

        int count = 0;
        for (int balance : balances) {
            if (balance >= n)
                count++;
        }
        String[] results = new String[count];

        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance >= n) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }

        return results;
    }

    //Найти клиентов с отрицательным балансом

    public static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {

        int count = 0;
        for (int balance : balances) {
            if (balance < 0)
                count++;
        }
        String[] results = new String[count];

        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance < 0) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }

        return results;

    }

    //Пополнение баланса с комиссией: <=100 - 2 % | >100 - 1%

    static void depositMoney(String[] clients, int[] balances, String client, int money) {
        //1. Найти клиента в базе ( внашем случае в массивах). Имеется в виду найти индекс имени.
        //Делаем  ограничение для учебного тестового задания: имена в массиве повторяться не будут.
        //2. Считаем сумму пополнения с учетом комиссии.
        //3. Обновляем баланс



        //1
      // int clientIndex =  findClientIndexByName(clients, client);

        //2
        //int moneyToDeposit = calculateDepositAmountAfterCommission(money);

        //3

        balances [findClientIndexByName(clients, client)] += calculateDepositAmountAfterCommission(money);


        // int moneyToDeposit = money <= 100 ? money - money * 0.02 : money - money * 0.01; Ошибка double
        //Чтобы дробное значение (дабл) првератить в целочисленное (инт) нужно
        // сделать приведение подобных (округлить):

      }

     static int findClientIndexByName (String[] clients, String client){
        int clientIndex = 0;
        for (String cl: clients){
            if(cl == client){
                break;
            }
            clientIndex++;
        }

        return clientIndex;
    }
static int calculateDepositAmountAfterCommission (int money) {

        return money <= 100 ? (int) (money - money * 0.02) : (int)(money - money *0.01);

        }



}
