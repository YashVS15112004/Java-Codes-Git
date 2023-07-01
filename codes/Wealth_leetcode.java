import java.util.Arrays;
import java.util.Scanner;
public class Wealth_leetcode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of rows ::");
        int n = in.nextInt();
        System.out.print("Enter the no of cols ::");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements ::");
        for(int row = 0;row<n;row++){
            for(int col =0;col<m;col++)
            {
                arr[row][col]=in.nextInt();
            }
        }
        int max_wealth=max(arr,n,m);
        System.out.println(max_wealth);
    }
    static int max(int[][] arr,int n,int m)
    {
        int[] s = new int[n];
        for(int row = 0;row<n;row++){
            int sum=0;
            for(int col =0;col<m;col++)
            {
                sum+=arr[row][col];
            }
            s[row]=sum;
        }
        return(max(s,n));
    }
    static int max(int[] s,int n)
    {
        int max=0;
        for(int i =0;i<n;i++)
        {
            int largest=s[i];
            for(int j=i+1;j<n;j++)
            {
                if(largest<s[j])
                {
                    int temp = s[j];
                    s[j] = largest;
                    largest = temp;
                }
            }
          max=largest;
            return max;
        }
        return max;
    }
}
