package Lesson_05r;

import java.util.Arrays;

public class WithdrawHomeWork {

    /*
    1. Напишите метод, который будет снимать деньги со счета клиента и возвращать остаток на счете.
        Если дененг на счете недостаточно метод будет возвращать -1 .
    2. Код должен содержаться в классе Withdraw. Сигнатура метода:
        public static int withdraw (String[] clients, int[] balances, String client, int money).
    3. Протестируйте свой код в main методе.
     */

    public static void main(String[] args) {
        String[] names = {"Ann", "Denis", "Jan", "Danil"};
        int[] balances = {100, 14, 238, 1819};

        System.out.println(withdraw(names, balances, "Jan", 22));
        System.out.println(Arrays.toString(balances));


    }

    public static int withdraw (String[] clients, int[] balances, String client, int money){
        int newBalance = 0;
        int count = 0;
        int index = 0;
        for(String element : clients) {
            if (element == client) {
                index = count;
            }
            count++;
        }


        if (balances[index] < money) {
            newBalance = -1;
        }
        else{
            newBalance = balances[index] - money;
            balances[index] = newBalance;
        }

        return newBalance;

    }

}
