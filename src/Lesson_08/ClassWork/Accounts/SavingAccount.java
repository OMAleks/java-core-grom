package Lesson_08.ClassWork.Accounts;

public class SavingAccount extends Account {
    int SavingPerMonth;

    public SavingAccount(String bankName, String ownerName, int moneyAmount, int savingPerMonth) {
        super(bankName, ownerName, moneyAmount);
        SavingPerMonth = savingPerMonth;
    }


    @Override           //Это запись - нотация. Она служит для лучшей ориентации в коде
    void changeOwnerName(String newOwnerName){
        if(newOwnerName == "Jack" || newOwnerName == "Ann")
            ownerName = newOwnerName;
        else
            System.out.println("Sorry, you can't change owner name of this saving account");
    }
    //Мы использовали метод с таким же названием, как и родительский метод, но изменили
    //его содержимое. Такой процесс называется "Переопределение метода" (перезапись), в жаргоне кодеров
    // - overriding .

}
