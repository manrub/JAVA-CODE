import java.util.Arrays;
import java.util.List;

public class countingSort {

    public void sort(int[] arr,int max)
    {   int[] brr=new int[arr.length];
        int[] count=new int[max+1];
        for(int i=0;i<=max;i++)
            count[i]=0;
        for(int i=0;i<arr.length;i++)
            count[arr[i]]++;
        for(int i=1;i<=max;i++)
            count[i]=count[i]+count[i-1];
        for(int j= arr.length-1;j>=0;j--)
        {
            brr[count[arr[j]]-1]=arr[j];
            count[arr[j]]--;

        }
        for(int i=0;i<arr.length;i++)
            System.out.print(brr[i]+" ");


    }














    int max(int[] arr)
    {int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
                max=arr[i];

        }
        return max;
    }
    public static  void main(String[] args)
    {
        countingSort ob=new countingSort();
        int arr[]=new int[]{0, 7,1,1,0,2,3,4, 2,6,7,8};
        ob.sort(arr,ob.max(arr));




    }
}
