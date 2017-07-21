import java.util.Scanner;

/**
 * Created by Zare3 on 19/07/2017.
 */
public class Account {
    private double balance;
    private double accountNumber;

    Scanner input = new Scanner(System.in);

    public Account() {
        accountNumber = 2;
        balance = 1000;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return String.valueOf(" your account number is : " + this.accountNumber) + String.valueOf("  and your balance is : " + this.balance);
    }

    public void withdraw() {
        System.out.println(" Please enter the amount you would like to withdraw : ");
        double amount = input.nextDouble();
        if (amount > balance) {
            System.out.println(" there is not enough money ");
        } else {
            System.out.println(" done. and your balance is :" + (balance - amount));
        }
    }

    public void deposit() {
        System.out.println(" Please enter the amount you would like to deposit : ");
        double amount = input.nextDouble();
        if (amount <= 0) {
            System.out.println(" please enter correct amount !!! ");
        } else {
            System.out.println(" done. and your balance is : " + (balance + amount));
        }

    }
}
