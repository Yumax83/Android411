package account;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingAccount savingAccount = new SavingAccount(1000, 1.25);
        System.out.println("======== Сберегательный счет ========\n" +
                "Первоначальный депозит: $" + savingAccount.getBalance()
                + "\nПроцентная ставка: " + savingAccount.getInterestRate()+"%\n");

        CurrentAccount currentAccount = new CurrentAccount(5000,1000);
        System.out.println("======== Текущий счет ========\n" +
                "Первоначальный депозит: $" + currentAccount.getBalance()
                + "\nЛимит овердрафта: $" + currentAccount.getOverdraftLimit()+"\n");

        bank.addAccount(savingAccount);
        bank.addAccount(currentAccount);

        System.out.println("Вносим 100$ на сберегательный счет");
        bank.deposit(savingAccount, 100);
        System.out.println("Вносим 500$ на текущий счет");
        bank.deposit(currentAccount,500);
        System.out.println("\n===== Сберегательный и текущий счет ====");
        bank.printAccountBalances();
        System.out.println("Снимаем 150 долларов со сберегательного счета");
        bank.withdraw(savingAccount, 150);

        System.out.println("\n==== Сберегательный счет и текущий счет ====");
        bank.printAccountBalances();
        savingAccount.applyInterest();

        System.out.println("\nПосле начисления проценов");
        System.out.println("==== Сберегательный счет и текущий счет ====");
        bank.printAccountBalances();
    }

}
