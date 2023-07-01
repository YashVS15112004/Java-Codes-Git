import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements:: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the target element:: ");
        int target = in.nextInt();
        System.out.println("Enter the elements::");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] reverse = rev(arr,n);
        System.out.println(Arrays.toString(reverse));
        int idx = binarySearch(arr,target);
        System.out.print("The index is ::"+idx);
    }
        static int[] rev(int[] arr1, int n) {
        int temp=0;
        for (int i = 0; i < n; i++) {
            for(int j = i+1;j<n;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        return arr1;
        }
        static int binarySearch(int [] arr,int target)
        {
            int start =0;
            int end = arr.length-1;

            while(start<=end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                    //System.out.println(mid);
                }
            }
            return -1;
        }
    }
