import java.util.*;
public class twodarraylist {
    public static void main(String args[]){
         ArrayList <Integer> a=new ArrayList<>();
         a.add(36); 
         a.add(5); 
         a.add(6); 
         a.add(3); 
           ArrayList <Integer> b=new ArrayList<>();
         b.add(34); 
         b.add(52); 
         b.add(60); 
        
           ArrayList <Integer> c=new ArrayList<>();
         c.add(5); 
         c.add(50); 
        
         
       ArrayList <ArrayList<Integer>> arr= new ArrayList<>();
arr.add(a);arr.add(b);arr.add(c);
// System.out.println(arr);
        
//         for(int i=0;i<arr.size();i++){
//           for(int j=0;j<arr.get(i).size();j++){
// System.out.print(arr.get(i).get(j)+" ");
//           }System.out.println();
//         }

arr.add(new ArrayList<>());
arr.get(arr.size()-1).add(10);arr.get(arr.size()-1).add(20);
for(ArrayList<Integer> list:arr){
  for(int ele :list){
    System.out.print(ele +" ");
  }System.out.println();
}
    }
}
// System.out.println(arr.get(1).get(3));
        // System.out.printl(arr.get(0).set(1,7));
        // System.out.println(arr.get(2).add[3]);