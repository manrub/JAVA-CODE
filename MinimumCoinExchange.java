import java.util.Scanner;

public class MinimumCoinExchange
{ static int calculatecoins(int[] coins,int amount)
    {
        int[] arr=new int[amount+1];
        arr[0]=0;
        for(int i=1;i<amount+1;i++)
            arr[i]=Integer.MAX_VALUE;
        for(int i=1;i<=amount;i++)
        {
            for(int j=0;j<coins.length;j++)
            {
                if(i>=coins[j])
                {
                 int x=arr[i-coins[j]];
                 if(x<=Integer.MAX_VALUE &&x+1<arr[i])
                     arr[i]=x+1;
                }


            }
        }
        return arr[amount];

    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of  coins");
        int[] coins={9,6,5,1};
        int amount=sc.nextInt();
      System.out.println(calculatecoins(coins,amount));

    }
}
