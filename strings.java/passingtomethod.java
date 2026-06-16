import java.util.*;
public class passingtomethod {
public static void change(String x){
    x="sablok";
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x= "archita";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
