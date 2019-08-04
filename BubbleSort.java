import java.util.Scanner;
/*
public class BubbleSort {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            { if(arr[j]>arr[j+1])
                swap(arr,j,j+1);
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void swap(int[] arr ,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
*/
//enhanced bubble sort
//we can enchance time complexity of bubble sort  by adding extra flag
//O(n2),O(n2),O(n)
//stable  sorrting , inplace sorting,Top-up sortings
public class BubbleSort {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        boolean temp=true;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>0&&temp;i--)
        { temp=false;
            for(int j=0;j<i;j++)
            { if(arr[j]>arr[j+1]) {
                swap(arr, j, j + 1);
                temp = true;


            }

            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void swap(int[] arr ,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}