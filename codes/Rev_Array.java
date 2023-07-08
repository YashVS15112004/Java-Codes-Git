import java.util.Arrays;
import java.util.Scanner;
public class Rev_Array {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements ::");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the elements ::");
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The original array is ::"+" "+Arrays.toString(arr));
        rev(arr,n);
        System.out.println("The reversed array is ::"+" "+Arrays.toString(arr));
        in.close();
    }
    static void rev(int [] arr2,int n)
    {
        for(int i=0;i<n/2;i++)
        {
            int temp = arr2[n-i-1];
            arr2[n-i-1] = arr2[i];
            arr2[i] = temp;
        }
    }
}
