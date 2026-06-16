import java.util.*;
public class varargs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        multiple( 2,3,"kunal","rahul");
    }
    static void multiple(int a,int b,String ...v){
  System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
