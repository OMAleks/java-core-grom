package Lesson_05r;

import java.util.Arrays;

public class Balances {

    /*
    1. Напишете метод findClientsByBalance, который будет находить клиентов, баланс которых
        больше или равен входящему балансу (значению п).

    2. Напишите метод findClientsWithNegativeBalance, который будет находить клиентов с
        отрицательным балансом

    3. Напишите метод depositMoney, который будет пополнять баланс указанного клиента и возвращать
        сумму баланса после пополнения.

    4. Начальный код в редакторе ниже.

    5. Массивы clients и balances - это клиенты и их балансы. Считается, что индекс клиентов в clients
        всегда соответствует индексу баланса в balances.

    6. Протестируйте свои методы в main.

     */


    public static void main(String[] args) {

        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(Arrays.toString(findClientsByBalance(names, balances, -100)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));

        depositMoney(names, balances, "Ann", 2000);
        System.out.println(Arrays.toString(balances));



    }



    public static String[] findClientsByBalance(String[] clients, int[] balances, int n) {
        //write code here
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

    public static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {
        //write code here
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

    public static int depositMoney(String[] clients, int[] balances, String client, int money) {
        //write code here
        int clientIndex = 0;
        for (String cl: clients){
            if(cl == client){
                break;
            }
            clientIndex++;
        }

    balances[clientIndex] += money;

        return balances [clientIndex];

    }
}
