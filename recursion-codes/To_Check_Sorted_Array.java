import java.util.Arrays;
import java.util.Scanner;

public class To_Check_Sorted_Array{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements::");
        int len = in.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The array is :: "+Arrays.toString(arr));
        if(sarr(arr,0)==true)
        {
            System.out.println("The array is sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }
                in.close();

    }
    static boolean sarr(int[] arr,int cnt)
    {
        boolean flag = true;
        if(cnt==arr.length-1)
        {
            return flag;
        }
        else
        {
            if(arr[cnt]<=arr[cnt+1])
            {
                flag=true;
            }
            else
            {
                return false;
            }
            return sarr(arr,cnt+1);
        }
    }
}