import java.util.Arrays;
import java.util.Scanner;

public class Swapping_2elem_Array {
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

        System.out.println("Enter the 2 indexes ::");
        int a = in.nextInt();
        int b = in.nextInt();

        swap(arr,a,b);

        System.out.println("The array after swapping ::");

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr2, int idx1 ,int idx2)
    {
        int temp = arr2[idx2];
        arr2[idx2] = arr2[idx1];
        arr2[idx1] = temp;

    }
}
