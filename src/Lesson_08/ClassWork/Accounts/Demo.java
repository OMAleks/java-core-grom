package Lesson_08.ClassWork.Accounts;

public class Demo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SomeBanke", "Denis", 1000, 50);
        savingAccount.depositMoney(100);

        System.out.println(savingAccount.moneyAmount);

        savingAccount.changeOwnerName("Oleg");

        System.out.println(savingAccount.ownerName);

        //-------------------------------------

        CheckingAccount chekingAccount = new CheckingAccount("SomeBanke", "Denis", 1000, 500);

        chekingAccount.changeOwnerName("Oleg");

        System.out.println(chekingAccount.ownerName);
    }
}
