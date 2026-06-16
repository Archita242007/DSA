
    import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {

    public static void main(String[] args) {

        int n = 3;

        List<String> result = generate(n);

        System.out.println(result);
    }

    public static List<String> generate(int n) {

        List<String> ans = new ArrayList<>();

        bkt("", 0, 0, n, ans);

        return ans;
    }

    public static void bkt(String s, int l, int r, int n, List<String> ans) {

        // Base Case
        if (l == n && r == n) {
            ans.add(s);
            return;
        }

        // Add '('
        if (l < n) {
            bkt(s + "(", l + 1, r, n, ans);
        }

        // Add ')'
        if (r < l) {
            bkt(s + ")", l, r + 1, n, ans);
        }
    }
}
