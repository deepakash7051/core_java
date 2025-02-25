package OOP;

/**
 * Example of construtor
 */
public class Account {
    
    private String name;
    private String email;
    private int amount;

    public Account(String name, String email, int amount) {
        this.name = name;
        this.email = email;
        this.amount = amount;
        System.out.println("Hello " + this.name + ", your balance is " + this.amount);
    }

    public void deposit(int depositAmount) {
        this.amount += depositAmount;
        System.out.println("Amount after deposit: " + this.amount);
    }

    public void withdraw(int withdrawalAmount) {
        if (withdrawalAmount > this.amount) {
            System.out.println("Insufficient funds! Your balance is: " + this.amount);
        } else {
            this.amount -= withdrawalAmount;
            System.out.println("Amount after withdrawal: " + this.amount);
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + this.amount);
    }
}
