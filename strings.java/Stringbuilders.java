import java.util.Scanner;

public class Stringbuilders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder("archita");//STRING TO STRING BUILDER  //arraylist of strings
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());
        s.append("queen");
        s.setCharAt(2, 's');
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        //String builder to string
        String t=s.toString();
        System.out.println(t);
        s.deleteCharAt(1);
        s.insert(4,'s');
        System.out.println(s);





        //s.reverse()=>
        //     int i=0;int =s.length()-1;
        // while (i<=j) {
        //     char t1=s.charAt(i);
        //      char t2=s.charAt(j);
        //      s.setCharAt(i, t2);
        //      s.setCharAt(j, t1);
        //      i++;j--;
        // }System.out.println(s);
    }
}
