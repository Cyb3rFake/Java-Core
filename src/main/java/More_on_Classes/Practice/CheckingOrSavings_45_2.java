package More_on_Classes.Practice;

import java.util.Scanner;

public class CheckingOrSavings_45_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double saving = read.nextDouble();
        double checking = read.nextDouble();

        Account savingAcc = new SavingAcc(saving);
        Account checkingAcc = new CheckingAcc(checking);

        System.out.println(savingAcc.getIncome());
        System.out.println(checkingAcc.getIncome());
    }
}
class Account {

    protected double amount;

    public Account(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public double getIncome() {
        return 0;
    }
}

class SavingAcc extends Account {
    public SavingAcc(double amount) {
        super(amount);
    }
    //Override the method for saving account
    public double getIncome() {
        return amount + amount * 0.2;
    }
}
class CheckingAcc extends Account {
    public CheckingAcc(double amount) {
        super(amount);
    }
    //Override the method for checking account
    public double getIncome() {
        return amount + amount * 0.05;
    }
}
