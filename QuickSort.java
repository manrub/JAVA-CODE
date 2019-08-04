public class QuickSort {
    static int partition(int[] arr,int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int x=arr[i];
                arr[i]=arr[j];
                arr[j]=x;
            }
        }
        int x=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=x;

        return i+1;
    }

    static void quicksort(int[] arr,int low,int high)
    {
        if(high>low)
        {
            int p=partition(arr,low,high);
            quicksort(arr,low,p-1);
            quicksort(arr,p+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,9,2,31,4,21,11,1};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
