import java.util.Scanner;

public class Rotated_Binary_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements::");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target element::");
        int target = in.nextInt();
        System.out.printf("Found at %d",+bs(arr,target,0,n-1));
        in.close();
}
static int bs(int[] arr,int target,int start,int end)
{
    int mid = start + (end-start)/2;
    if(start>end)
    {
        return -1;
    }
    if(arr[mid]==target)
    {
        return mid;
    }
    else if(arr[start]<=arr[mid])
    {
        if(target>=arr[start]&&target<=arr[mid])
        {
            return bs(arr, target, start, mid-1);
        }
        else
        {
            return bs(arr, target, mid+1, end);
        }
    }
    else if(target>=arr[mid]&&target<=arr[end])
    {
        return bs(arr, target, mid+1, end);
    }
    else
    {
        return bs(arr, target, start, mid-1);
    }

}
}
