import java.util.Scanner;

class student {
    String name;
    int cgpa;
    int rn;
}

public class userDefinedDataTypes {
    // public static class student{
    // String name;
    // int cgpa;
    // int rn;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        s1.name = "Archita";
        s1.cgpa = 10;
        s1.rn = 43;
        student s2 = new student();
        s2.name = sc.next();
        s2.cgpa = sc.nextInt();
        s2.rn = 1;
        System.out.println(s1.name + " " + s2.name + " ");
        s2.rn = 2;
        System.out.println(s2.cgpa);
    }
}
