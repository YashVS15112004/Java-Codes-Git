import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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
        int [] sortedarr = ssort(arr,n);
        System.out.println("The sorted array is::");
        System.out.println(Arrays.toString(sortedarr));
    }
    static int[] ssort(int[] arr,int n)
    {
          for(int i=0;i<arr.length-1;i++)
          {
              int last = arr.length-i-1;
              int maxIndex = getMaxIndex(arr,0,last);
              swap(arr,maxIndex,last);
          }
          return arr;
    }

    static int getMaxIndex(int[] arr, int start, int end)
    {
        int max= start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]<arr[i])
            {
                 max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second )
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
