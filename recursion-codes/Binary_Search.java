import java.util.Scanner;
public class Binary_Search {
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
        int ans = bs(arr,target,0,arr.length-1);
        System.out.println(ans);
        in.close();

    }
    static int bs(int[] arr,int target,int start,int end)
    {
        int mid = start+(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[mid]<target)
        {
            start=mid+1;
            return bs(arr,target,start,end);
        }
        else {
            end = mid-1;
            return bs(arr,target,start,end);
        }
    }
}
