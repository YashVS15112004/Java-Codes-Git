import java.util.Arrays;
import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements required::");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter the target element::");
        int target = in.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        if(binary_s(arr,target)==1)
        {
            System.out.println("Found the element.");
        }
        else if(binary_s(arr,target)==0){
            System.out.println("Not found.");
        }
    }
    static int binary_s(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return 1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid-1;
            }
        }
        return 0;
        // System.out.println("The array is ->");
        // System.out.println(Arrays.toString(arr));
    }
}