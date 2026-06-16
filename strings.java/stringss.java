import java.util.*;
public class stringss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] arr={'a','r','c','h','i','t','a'};
        for(char ele: arr){
            System.out.print(ele+ " ");
        }
        String s="archi IS a goOOOOd giRl";
        System.out.println(s);
        // String str= sc.nextLine();// read full line
        // System.out.println(str);
        //  String st= sc.next();// read only till a space
        // System.out.println(st);
        System.out.println(s.charAt(6));
        System.out.println(s.length());
        System.out.println(s.indexOf('r'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("archi"));
        System.out.println(s.startsWith("ar"));
        System.out.println(s.endsWith("sf"));
        String s1=" abcd";
        System.out.println(s.compareTo(s1));
       int s2=s.length();
       int s3=s1.length();
    //   System.out.println(s.concat(s1));
        s=s.concat(s1);
        System.out.println(s);
        // another way to concat
        s=s+" and intelligent.";
        s=10 + s;
        s=s+'\n';
        s=s+'n';
        System.out.println(10+20+"archi");
        System.out.println("archi"+10+20);
        System.out.println(10+"archi"+20);
        System.out.println('b'+2+"archi" );
        System.out.println(s);

        //integer to string
        //(1)
        int x=1111;
        String s4="";//take empty string
        s4=s4+x;
        System.out.println(s4);
        //(2)
        s4=Integer.toString(x);
        System.out.println(s4);

        //string to integer
        String s5="5438745";
        int n=Integer.parseInt(s5);
        System.out.println(n+1);

        //string to array
      char[] chr = new char[4];
chr = s1.toCharArray();

for(char ch : chr){
    System.out.println(ch);
}
        //isTareekeKoCamelCaseKehteHai = jisme no space or first letter capital hota ho except first word
        //IsWayKoPascalCaseKehteHai
       String s6="fkngeskvn";
        System.out.println(s6.substring(4));
        System.out.println(s6.substring(1,5));//1 to 4 will be printed




    //strings are immutable= cannot change individual characters
        String s7="archita";
        String s9="archita";
        System.out.println(s7.equals(s9));//returns true if length and every chr of both strings are same

        // to replace c with s
        s7=s7.substring(0,2)+"s"+s7.substring(3);// hence space complexity is bad
        System.out.println(s7);

    //to create a new string with same component like archita 
    String s10="archita";
        String s8=new String("archita");//otherwise only one component archita will be created and both s7 and s8 will point that
        if(s10==s8)System.out.println("true");
        else System.out.println("false");// it will return false because the address where they are stored are compared
     
        sc.close();
    }
}
