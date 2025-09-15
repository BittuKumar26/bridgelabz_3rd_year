package Inheritance;

class Account {
    private double balance;
    public Account(double b) { balance = b; }
    public double getBalance() { return balance; }
    public void setBalance(double b) { balance = b; }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Account a = new Account(1000);
        a.setBalance(2000);
        System.out.println(a.getBalance());
    }
}
