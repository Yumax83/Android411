package account;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount){
        account.withdraw(amount);
    }
    public void printAccountBalances(){
      for (Account account: accounts){
          System.out.println("Баланс счета: " + account.getBalance());
      }
    }
}
