public class MergeSort
{
    static void  mergesort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int divide=(low+high)/2;
            
        }

    }
    public static void main(String[] args) {
        int[] arr={2,3,9,2,31,4,21,11,1};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    
    }
}
