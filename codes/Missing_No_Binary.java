import java.util.Scanner;
public class Missing_No_Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements::");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int ans = miss(arr);
        System.out.println(ans);
    }
    static int miss(int[] arr) {
        int unique=0;

        for(int n:arr)
        {
            unique^=n;
        }

        return unique;
    }
}
