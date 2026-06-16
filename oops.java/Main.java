//methods 
import java.util.Scanner;
class car{
    //attributes of car
    String company;
    int speed;
    int seat;
    String color;
    //method to display car details
    void display(){
        System.out.println("company: "+ company);
        System.out.println("speed: "+speed);
        System.out.println("color: "+color);
    }
    void drive(){
        System.out.println("driving at " + speed + "km/h");
    }
}
public class Main{ 
      public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       //car object
        car archita= new car();
        //assigning values to car variables
        archita.company = "bmw";
        archita.speed = 140;
        archita.seat = 4;
        archita.color = "black";
        archita.display();
        archita.drive();
        sc.close();
    }
}
