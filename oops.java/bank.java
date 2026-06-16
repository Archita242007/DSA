// access specifiers

public class bank {
    private int pin;
    protected int branch;
    public String bankName;

    public void setPin(int n) { 
        pin = n; //instead we can write this.pin=pin 
        // this is a keyword used when we have to use same variable like this pin=pin (not a valid syntax)
    }
     public void getPin() {
        System.out.println( pin);
    }
      public static void main(String[] args) {

        bank b1 = new bank();

        b1.bankName = "SBI";
        b1.setPin(0000);
        b1.getPin();
}
}