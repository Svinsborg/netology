package BankOfAmerica;

public class CreditAccount extends Account { // Кредитный

    //Кредитный не может иметь положительный баланс – если платить с него,
    // то уходит в минус, чтобы вернуть в 0, надо пополнить его.


    int balanceCredit;

    public CreditAccount(int balanceCredit) {
        this.balanceCredit = balanceCredit;
    }

    public double getBalanceCredit() {
        return balanceCredit;
    }

    public void setBalanceCredit(int balanceCredit) {
        this.balanceCredit = balanceCredit;
    }

    @Override
    void pay(int amount) {
        balanceCredit = balanceCredit - amount;
    }

    @Override
    void transfer(Account account, int amount) {
        balanceCredit = balanceCredit - amount;
        account.addMoney(amount);
    }

    @Override
    boolean addMoney(int amount) {
        if (balanceCredit + amount > 0) {
            System.out.println("Сумма платежа превышена");
            System.out.println("Пополните счет на " + (0 - balanceCredit) + " ₽");
            return false;
        } else {
            balanceCredit = balanceCredit + amount;
            return true;
        }
    }
}