package BankOfAmerica;

public abstract class Account {

    void pay(int amount){   // заплатить

    }

    void transfer(Account account, int amount){ // перевести

    }

    boolean addMoney(int amount){ // пополнить
        return true;

    }

}