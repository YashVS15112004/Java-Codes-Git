import java.util.Arrays;
import java.util.Scanner;

public class Numbers_With_Even_No_Digits {
    public static void main(String[] args) {
        System.out.print("Enter the no of elements ::");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ::");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The array is ::");
        System.out.println(Arrays.toString(arr));
        int x = even(arr,n);
        System.out.println("The number of elements are ::"+" "+x);
        in.close();
    }
    static int even(int[] arr2,int n)
    {
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            int a = arr2[i];
            while(a!=0)
            {
                count++;
                a = a/10;
            }
            if(even(count))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
        return cnt;
    }
    static boolean even(int count)
    {
        return count % 2 == 0;
    }
}
