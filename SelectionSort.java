import java.util.Scanner;
//O(N2),O(N2),O(N2)
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int largest=0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n-1; i > 0; i--) {
            largest=0;
            for(int j=1;j<=i;j++)
            {
                if(arr[j]>arr[largest])
                {
                    largest=j;
                }
            }
            System.out.println(arr[largest]);
            temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
