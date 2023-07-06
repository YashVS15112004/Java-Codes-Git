import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
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
        int j=arr.length-i-1;
        System.out.println("The sorted array is::");
        System.out.println(Arrays.toString(selection_s(arr,i,j)));
        in.close();
    }
    static int[] selection_s(int []arr,int i,int j)
    {
        if(i==arr.length-1)
        {
            return arr;
        }
        else
        {
            j=arr.length-i-1;
            int max = max_idx(arr, 0, j);
            swap(arr,max,j);
            return selection_s(arr, i+1, j);
        }

    }
    static int max_idx(int []arr,int i,int j)
    {
        int max = i;
        for(int a = i;a<=j;a++)
        {
            if(arr[max]<arr[a])
            {
                max = a;
            }
        }
        return max;
        
    }
    static int[] swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
