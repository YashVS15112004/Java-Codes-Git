import java.util.Arrays;
import java.util.Scanner;

public class Sum_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements::");
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int len = arr.length;
        sum_triangle(arr,len);
        System.out.println(Arrays.toString(arr));
    }
    static int[]  sum_triangle(int[] arr,int len)
    {
        if(len<=1)
        {
            return arr;
        }
        else {
            arr = sum(arr,len);
            len = arr.length;
            sum_triangle(arr,len);
            System.out.println(Arrays.toString(arr));
            return arr;
        }
    }
    static int[] sum(int[] arr,int len)
    {
        int[] arr1 = new int[len-1];
        for(int i=0;i<len-1;i++)
        {
            int j = i+1;
            arr1[i]=arr[i]+arr[j];
        }
        return arr1;
    }
}
