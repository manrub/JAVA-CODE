//using recursive approach
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Scanner;
/*
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
         char[] ch1=s.toCharArray();
         char[] ch2=s1.toCharArray();
        int m=ch1.length;
        int n=ch2.length;
        System.out.println(lcs(ch1,ch2,m,n));


    }
    static public int  lcs(char[] ch1,char[] ch2,int m,int n)
    { if(m==0 || n== 0)
        return 0;
      if(ch1[m-1]==ch2[n-1])
          return 1+lcs(ch1,ch2,m-1,n-1);
      return max(lcs(ch1,ch2,m,n-1),lcs(ch1,ch2,m-1,n));


        }
        static public int max(int a,int b) {
         return (a>b) ? a:b;
        }

}
*/
// using D.P approach
class LongestCommonSubsequence {
    static String s1, s2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int m = ch1.length;
        int n = ch2.length;
        int[][] mem = new int[m + 1][n + 1];
        lcs(ch1, ch2, mem, m, n);

    }

    public static void lcs(char[] ch1, char[] ch2, int[][] mem, int m, int n) {
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    mem[i][j] = 0;
                else if (ch1[i - 1] == ch2[j - 1])
                    mem[i][j] = mem[i - 1][j - 1] + 1;
                else
                    mem[i][j] = max1(mem[i - 1][j], mem[i][j - 1]);
            }
        }
        // printing of
        System.out.println(mem[m][n]);
        int t = mem[m][n];
        char[] c = new char[t + 1];
        c[t] = '\0';
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                t--;
                c[t] = s1.charAt(i - 1);
                i--;
                j--;

            } else {
                if (mem[i][j - 1] > mem[i - 1][j])
                    j--;
                else
                    i--;
            }
        }
            System.out.print("LCS of " + s1 + " and " + s2 + " is ");
            for (int k = 0; k <= mem[m][n]; k++)
                System.out.print(c[k]);



    }


    public static int max1(int a, int b) {
        return (a > b) ? a : b;


    }
}