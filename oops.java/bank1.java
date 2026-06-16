//encapsulation

public class bank1 {

    private double balance;

    // Constructor
    bank1() { // we did not write public because here blank means package-private i.e. it can be access within the same package
        balance = 0.0;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    public void setBalance(int n) {
        if (n > 0) {
            balance += n;
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public static void main(String[] args) {

        bank1 b2 = new bank1(); //0.0
          // b2.balance = 1000; error because balance is private
             b2.setBalance(-10); // Invalid Amount
        System.out.println(b2.getBalance()); // 0.0

        b2.setBalance(1000);
        System.out.println(b2.getBalance()); // 1000.0
}
}