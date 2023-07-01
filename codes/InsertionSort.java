import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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
        int [] sortedarr = isort(arr);
        System.out.println("The sorted array is::");
        System.out.println(Arrays.toString(sortedarr));
}
static int[] isort(int[] arr)
{
    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=i+1;j>0;j--)
        {
            if(arr[j]<arr[j-1])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
            else {
                break;
            }
        }
    }
    return arr;
}
}