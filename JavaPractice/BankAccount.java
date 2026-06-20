package JavaPractice;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
        
    }
    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit (double amount){
        if (amount >= 0){
            this.balance += amount;
        }
    }
    public void withdraw (double amount){
        if (amount > 0 && amount <= balance){
            this.balance -=amount;
        } else{
            System.out.println("Invalid Withdrawal Amount.");
        }
    }
    public void displayAccount(){
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }
}

