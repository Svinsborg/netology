package BankOfAmerica;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(542);
        CreditAccount creditAccount = new CreditAccount(0);
        CheckingAccount checkingAccount = new CheckingAccount(125);
        System.out.println();

        System.out.println("Задолжность по кредитной карте " + creditAccount.balanceCredit + " ₽");
        System.out.println("Остаток средств на расчетном счете " + checkingAccount.balanceChecking + " ₽");
        System.out.println("Остаток средств на сберегательнос счете " + savingsAccount.balanceSaving + " ₽");

        System.out.println();
        System.out.println("1. Платеж с кредитной карты 20 ₽ :");
        creditAccount.pay(20);
        System.out.println("Задолжность по кредитной карте " + creditAccount.balanceCredit + " ₽");

        System.out.println();
        System.out.println("2. Перевод с сберегательного счета на погашение кредита в 40 ₽:");
        savingsAccount.transfer(creditAccount, 40);
        System.out.println("Задолжность по кредитной карте " + creditAccount.balanceCredit + " ₽");
        System.out.println("Остаток средств на сберегательнос счете " + savingsAccount.balanceSaving + " ₽");

        System.out.println();
        System.out.println("3. Перевод с сберегательного счета на погашение кредита в 20 ₽:");
        savingsAccount.transfer(creditAccount, 20);
        System.out.println("Задолжность по кредитной карте " + creditAccount.balanceCredit + " ₽");
        System.out.println("Остаток средств на сберегательнос счете " + savingsAccount.balanceSaving + " ₽");

        System.out.println();
        System.out.println("4. Платеж с расчетного счета 110 ₽");
        checkingAccount.pay(110);
        System.out.println("Остаток средств на расчетном счете " + checkingAccount.balanceChecking + " ₽");

        System.out.println();
        System.out.println("5. Платеж с расчетного счета 60 ₽");
        checkingAccount.pay(60);
        System.out.println("Остаток средств на расчетном счете " + checkingAccount.balanceChecking + " ₽");

    }
}
