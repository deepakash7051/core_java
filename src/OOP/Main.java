package OOP;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.setMake("Porche");
        // car.setModel("Carrera");
        // car.setDoors(2);
        // car.setConvertible(true);
        // car.setColor("Black");
        // car.describeCar();

        Account myAccount = new Account("Alice", "alice@example.com", 1000);
        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.checkBalance();
    }
}
