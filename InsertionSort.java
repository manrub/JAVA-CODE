import java.util.Scanner;

public class InsertionSort
{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int x=0,j=0;
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            x=arr[i];
            j=i;
            while(j>0&&arr[j-1]>x)
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=x;
        }

    for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}
