import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// import java.util.Vector;
// import java.util.ArrayList;
public class arrayList {
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
ArrayList<Integer> arr=new ArrayList<>();
arr.add(5);
arr.add(8);
arr.add(7);
arr.add(88);
arr.add(90);
System.out.println(arr.get(4));
arr.set(4, 50);
System.out.println(arr);
int n=arr.size();
for(int i=0;i<n;i++)
{
    System.out.print(arr.get(i)+" ");
}
for(int ele:arr)
{
    System.out.println(ele+" ,");
}
arr.add(56);
arr.add(1,55);
arr.remove(arr.size()-2);
Collections.reverse(arr);
System.out.println(arr);
int i=0,j=arr.size()-1;
while(i<j)
{
    int temp=arr.get(i);
    arr.set(i, arr.get(j));
    arr.set(j, temp);
    i++;
    j--;
}
System.out.println(arr);
sc.close();
    }
}
