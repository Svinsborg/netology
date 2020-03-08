package BankOfAmerica;

public class CheckingAccount extends Account { // Расчетный

    //Расчетный может выполнять все три операции,
    // но не может уходить в минус.

    int balanceChecking;

    public CheckingAccount(int balanceChecking) {
        this.balanceChecking = balanceChecking;
    }

    public int getBalanceChecking() {
        return balanceChecking;
    }

    public void setBalanceChecking(int balanceChecking) {
        this.balanceChecking = balanceChecking;
    }

    @Override
    void pay(int amount) {
        if (0 > balanceChecking - amount) {
            System.out.println("Не хватает средств для совершения платежа");
            System.out.println("Остаток на счете = " + balanceChecking + " ₽");
        } else {
            balanceChecking = balanceChecking - amount;
        }
    }

    @Override
    void transfer(Account account, int amount) {
        if (0 > balanceChecking - amount) {
            System.out.println("Не хватает средств для совершения платежа");
            System.out.println("Остаток на счете = " + balanceChecking);
        }

        if (account.addMoney(amount) == true) {
            balanceChecking = balanceChecking - amount;
        }

    }

    @Override
    boolean addMoney(int amount) {
        balanceChecking = balanceChecking + amount;
        return true;
    }
}