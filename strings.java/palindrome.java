import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int lo=0, hi=str.length()-1;
        while(lo<=hi){
            if(str.charAt(lo)==str.charAt(hi)){
                lo++;
                hi--;
            }
        }System.out.println("palindrome");
    }
}
