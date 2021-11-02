package Lesson_08.ClassWork.Accounts;

public class Account {
     String bankName;
     String ownerName;
     int moneyAmount;

    public Account(String bankName, String ownerName, int moneyAmount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }

    void depositMoney(int amount) {
        moneyAmount += amount;
    }

    //Мы можем использовали метод в РАЗНЫХ НАСЛЕДУЕМЫХ КЛАССАХ таким же названием, как и родительский метод,
    // но при этом изменить его содержимое. Такой процесс называется "Переопределение метода" (перезапись), в жаргоне кодеров
    // - overriding . Перезаписанный метод будет срабатывать только в том случае, если его вызывают из
    // класса, где он был перезаписан.

    //@Overriding - cлово, перед котороым стоит значок собаки (@), назівается аннотация. Работает по типу коментария.


    /*
    В одном и ТОМ ЖЕ КЛАССЕ могут содержаться методы с одним названием но разным кодом.
    Такой процесс написания называется "Перегрузкой метода" - Overloading.  Его используют
    тогда, когда отличие в методах несущественно и каждый раз создавать новый метод с
    похожим кодом не рационально. Напимер:
     */
    void depositMoney() {
        moneyAmount += 1000;
        System.out.println("deposit was succsessful");
    }
    //Ключевым условием для успешной перегрузки является отличие в параметрах. Причем
    //параметры должны отличаться не только по названию, но и по типу (или количеству):

    /*  Следующий метод не может быть использован (перезагружен), так как у него, несмотря
    на то, что названия переменной отличается, одинаковыми остаются тип и количество
    параметров:

    void depositMoney( int anotherAmount) {
        moneyAmount += anotherAmount + 100;
    }

    При добавлении параметра перегрузка будет работать:

        void depositMoney( int anotherAmount, String test) {
        moneyAmount += anotherAmount + 100;
    }

    При вызове метода компилятор считывает его параметры. Именно по отличию параметров компилятор
    сможет определить, какой именно метод нужно вызвать - оргинальный или перезагруженный.

    */

    void changeOwnerName(String newOwnerName){
        ownerName = newOwnerName;
    }



}
