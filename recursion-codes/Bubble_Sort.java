import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements::");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements::");
        for(int a=0;a<n;a++)
        {
            arr[a]=in.nextInt();
        }
        System.out.println("Unsorted array::");
        System.out.println(Arrays.toString(arr));
        int i=0;
        int j=i+1;
        System.out.println("The sorted array is::");
        System.out.println(Arrays.toString(bubble_s(arr,i,j)));
        in.close();
    }
    static int[] bubble_s(int[] arr,int i,int j)
    {
        if(i==arr.length-1)
        {
            return arr;
        }
        if(j<=arr.length-1)
        {
            if(arr[i]>arr[j])
            {
                swap(arr,i,j);
            }
            return bubble_s(arr, i, j+1);
        }
        else
        {
            i = i+1;
            j = i+1;
            return bubble_s(arr, i, j);
        }
    }
    static int[] swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    } 
}
