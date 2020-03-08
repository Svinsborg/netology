package BankOfAmerica;

public class SavingsAccount extends Account { // Сберегательный

    // Со сберегательного счета нельзя платить, только переводить и пополнять.
    // Также сберегательный не может уходить в минус.

    int balanceSaving;

    public SavingsAccount(int balanceSaving) {
        this.balanceSaving = balanceSaving;
    }

    public double getBalanceSaving() {
        return balanceSaving;
    }

    public void setBalanceSaving(int balanceSaving) {
        this.balanceSaving = balanceSaving;
    }

    @Override
    void transfer(Account account, int amount) {
        if (0 > balanceSaving - amount) {
            System.out.println("Не хватает средств для совершения платежа");
            System.out.println("Остаток на счете = " + balanceSaving);
        }

        if (account.addMoney(amount) == true) {
            balanceSaving = balanceSaving - amount;
        }

    }

    @Override
    boolean addMoney(int amount) {
        balanceSaving = balanceSaving + amount;
        return true;
    }
}