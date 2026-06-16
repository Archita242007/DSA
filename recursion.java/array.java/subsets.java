import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        String s="abc";
             ArrayList<String> list=new ArrayList<>();
        subset("",s,0,list);
   System.out.println(list);
        
    }
    public static void subset(String ans,String s, int idx, ArrayList<String> list){
        if(idx==s.length()){
        list.add(ans);
        return;
    }
    char ch=s.charAt(idx);
    subset(ans+ch, s, idx+1,list);//pick
    subset(ans, s, idx+1,list);//skip
}
}