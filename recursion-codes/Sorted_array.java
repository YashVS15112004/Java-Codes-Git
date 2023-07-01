import java.util.Scanner;

public class Sorted_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements::");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements::");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(issorted(arr,arr.length));
    }
    public static boolean issorted(int[] arr,int size)
    {
        if(size==1)
        {
            return true;
        }
        else if(arr[size-1]<arr[size-2])
        {
            return false;
        }
        else{
            return issorted(arr,size-1);
        }
    }
}
