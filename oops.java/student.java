//constructors

public class student {
    String name; 
    double cgpa; 
    
student(){ //default constructor
    name="archita";
    System.out.println("object created and name is "+name);
}
     student(String n){ //parameterised constructor
         name = n;
        System.out.println("Parameterized constructor and name is : " + name);
     }
      student(String n, double gpa) {   // constructor overloading
        name = n;
        cgpa = gpa;
        System.out.println("Name: " + name + ", CGPA: " + cgpa);
    }
    // there is no deconstructor in java but there is garbage collector which free the memory automatically
      public static void main(String[] args) {

        student stud1 = new student();
        student stud2 = new student("xy");
        student stud3 = new student("abcd");
        student stud4 = new student("archita", 10);
    }
}

