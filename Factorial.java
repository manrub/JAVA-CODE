//factorial of two number m,n complexity O(m)
import java.util.Scanner;
public class Factorial
{
    static int[] mem;
    public static  void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        mem=new int[m];
        System.out.println(fact(n)+"                  "+fact(m));


    }
    static  public int  fact(int n)
    {
        if(n==0||n==1)
            return 1;
        if(mem[n-1]!=0)
                return mem[n-1];
        return  mem[n-1]=n*fact(n-1);


    }
}
