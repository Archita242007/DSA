import java.util.Scanner;

public class paa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        // 3.
        int c = 7; // 2n-1
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= c; k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            c -= 2;
            System.out.println();
        }
        // 4.
        for (char ch = 'A'; ch <= 'D'; ch++) {
            for (char cc = 'A'; cc <= ch; cc++) {
                System.out.print(cc);
            }
            System.out.println();
        }
        // 5.
        for (char ch = 'a'; ch <= 'd'; ch++) {
            for (char cc = 'a'; cc <= ch; cc++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        // 6.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int br = (2 * i + 1) / 2;
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print(ch);
                if (k < br) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
        // 7
        for (int i = 0; i <= 4; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        // 8
        int inisp = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < inisp; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 4 - i; l++) {
                System.out.print("*");

            }
            inisp += 2;
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = inisp - 2; k > 0; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            inisp -= 2;
            System.out.println();
        }
        // 9
        // int in = 6;
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int k = in ; k > 0; k--) {
        // System.out.print(" ");
        // }
        // for (int l = 1; l <= i; l++) {
        // System.out.print("*");
        // }
        // in -= 2;
        // System.out.println();
        // }
        // int inis = 2;
        // for (int i = 0; i < 4; i++) {
        // for (int j = 2; j <= 4 - i; j++) {
        // System.out.print("*");
        // }
        // for (int k = 0; k < inis; k++) {
        // System.out.print(" ");
        // }
        // for (int l = 2; l <= 4 - i; l++) {
        // System.out.print("*");
        // }
        // inis += 2;
        // System.out.println();
        // }
        int space = 6;// 2n-2
        for (int i = 1; i <= 7; i++) {// 2n-1
            int stars = i;
            if (i > 4) {
                stars = 8 - i;// 2n-i
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= stars; l++) {
                System.out.print("*");
            }
            if (i < 4) {
                space -= 2;
            } else {
                space += 2;
            }
            System.out.println();
        }
        //10
        for(int i=0;i<7;i++)//2n-1=7
        {
            for(int j=0;j<7;j++){
int top=i;
int left=j;
 int right=6-j;//2n-2-j
 int down=6-i;//2n-2-i
System.out.print(4-Math.min(Math.min(top,down),Math.min(left,right)));
            }System.out.println();
        }
        sc.close();
    }
}
