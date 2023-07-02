import java.util.Scanner;
public class Max_Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements::");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int s = arr[0];
        int e = arr.length-1;
        int m = 0;
        int min_elem = min(arr,s,e,m);
        int max_elem = max(arr,s,e,m);
        System.out.print("min = "+min_elem+","+"max = "+max_elem);
        in.close();
    }
    static int max(int[] arr,int s,int e,int mx)
    {
        if(s==e)
        {
            return mx;
        }
        else {
            if(mx<arr[s+1])
            {
                mx=arr[s+1];
            }
            return max(arr,s+1,e,mx);
        }
    }
    static int min(int[] arr,int s,int e,int mn)
    {
        if(s==e)
        {
            return mn;
        }
        else {
            if(mn>arr[s+1])
            {
                mn=arr[s+1];
            }
            return min(arr,s+1,e,mn);
        }
    }
}
