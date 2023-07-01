import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements::");
        int n =  in.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements::");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The unsorted array is::");
        System.out.println(Arrays.toString(arr));
        int [] sortedarr = csort(arr);
        System.out.println("The sorted array is::");
        System.out.println(Arrays.toString(sortedarr));
    }
    static int[] csort(int[] arr)
    {
        int i=0;
        while (i<arr.length)
        {
            int n = arr[i]-1;
            if(n!=i)
            {
                int temp=arr[n];
                arr[n]=arr[i];
                arr[i]=temp;
            }
            else {
                i++;
            }
        }
        return arr;
    }
}
