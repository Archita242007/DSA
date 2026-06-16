// public class mostFreqChr {
//     public char getMaxOccuringChar(String s) {
//         // code here
//         // int max=0;char ch=s.charAt(0);
// //       char[] chr = new char[s.length()];
// // chr = s.toCharArray();
// // for(int i=0;i<chr.length;i++){
// //     int c=0;
// //     for(int j=0;j<chr.length;j++){
// //         if(chr[i]==chr[j]){
// //             c++;
// //         }
// //     } if (c > max) {
// //                 max = c;
// //                 ch = chr[i];
// //             }
// //             else if (c == max && chr[i] < ch) {
// //                 ch = chr[i];
// //             }
// // }
// // return ch;
// //   O(n^2)

// // sorting approach=O(nlogn)

// // int n=s.length();
// // int max=-1;char ch=s.charAt(0);
// // char[] chr = new char[s.length()];
// // chr = s.toCharArray();
// // Arrays.sort(chr);
// // int i=0;int j=0;
// // while(j<n){
// //     if(chr[i]==chr[j]){
// //         j++;
// //     }else
// //     {
// //         int f=j-i;
// //         if(f>max){
// //             max=f;
// //             ch=chr[i];
// //         }i=j;
// //     }
// // } int f=j-i;
// //         if(f>max){
// //             max=f;
// //             ch=chr[i];
// //     }return ch;



// // frequency approach=O(n)

// int n=s.length();
// int f[]=new int[26];
// for(int i=0;i<n;i++){
//     char ch=s.charAt(i);
//     int idx=ch-97;f[idx]++;
// }
// int max=-1;char ans=s.charAt(0);
// for(int i=0;i<26;i++){
//    if(f[i]>max){
//        max=f[i];
//        ans=(char)(i+97);
       
//    }
// }return ans;
// }
// } 