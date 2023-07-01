import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements::");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements::");
        for(int i =0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The unsorted array is::");
        System.out.println(Arrays.toString(arr));
        int[] sarr = Bubblesort(arr,n);
        System.out.println("The sorted array is::");
        System.out.println(Arrays.toString(sarr));
    }
    static int[] Bubblesort(int[] arr,int n)
    {
        for(int i =0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=0;
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
