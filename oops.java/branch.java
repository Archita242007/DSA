//abstraction
//abstract class
    abstract class bank2 {
// abstract method
    abstract void getMoney();
}
//child class 
class branch extends bank2 {
//overriding a method from parent class
    @Override
    void getMoney() {
        System.out.println("IIT Clear");
    }


    public static void main(String[] args) {

        // Bank b1 = new Bank(); wrong can't access

        branch b2 = new branch();
        b2.getMoney();
    }
}
