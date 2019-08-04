import  java.util.Scanner;
public class Fibonacci {

    static int[] fibo;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibo=new int[n];
        System.out.println(Fib(n));

    }
    public static  int Fib(int n)
    { int a=0,b=1;
    if(n==1)
        return a;
    else if(n==2)
            return b;

    else
    {
        if(fibo[n-1]!=0)
            return fibo[n-1];
        return fibo[n-1]=Fib(n-1)+Fib(n-2);
    }


    }
}
