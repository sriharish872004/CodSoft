package sri;
import java.util.Scanner;
import java.lang.System;
class ATMMachine {
    private double balance;
    public ATMMachine(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0;
        }
    }
    public void deposit(double amount)
    {
        if(amount < 100){
            System.out.println("Minimum Deposit is Rs-100.0");
        }
        else {
            balance += amount;
            System.out.println("Amount Rs:"+amount+" Deposited...");
        }
    }
    public void Withdraw(double wd){
        if(wd <= balance){
            balance = balance - wd;
            System.out.println("Amount Rs:"+ wd +" Withdrawn...");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void getBalance(){
        System.out.println("Current Balance is:"+balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** ATM Interface ***");
        /**System.out.print("Enter the Initial Balance: ");
        double initialBalance = sc.nextDouble();*/
        double initialBalance = 2000;
        ATMMachine atm = new ATMMachine(initialBalance);
        while (true) {
            System.out.println("Enter the option:");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.CheckBalance");
            System.out.println("4.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter The Deposit Amount:");
                    double amount = sc.nextDouble();
                    atm.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter Withdraw Amount:");
                    double wd = sc.nextDouble();
                    atm.Withdraw(wd);
                    break;
                case 3:
                    atm.getBalance();
                    break;
                case 4:
                    System.out.println("*** Thank you ***");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Select The Correct Option...");
                    break;
            }
        }
    }
}
