import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PickAndSkip {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s = sc.next();

        PickAndSkip obj = new PickAndSkip();

        List<String> result = obj.powerSet(s);

        System.out.println(result);
    }

    public List<String> powerSet(String s) {

        ArrayList<String> list = new ArrayList<>();

        subset("", s, 0, list);

        Collections.sort(list);

        return list;
    }

    public static void subset(String ans,String s,int idx,ArrayList<String> list) {

        if (idx == s.length()) {
            list.add(ans);
            return;
        }

        char ch = s.charAt(idx);

        // Pick
        subset(ans + ch, s, idx + 1, list);

        // Skip
        subset(ans, s, idx + 1, list);
    }
}