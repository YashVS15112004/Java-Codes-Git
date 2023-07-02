import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the term::");
        int n = in.nextInt();
        int ans = fibonac(n);
        System.out.print(ans);
        in.close();
    }
    static int fibonac(int n)
    {
        if(n<2)
        {
            return n;
        }
            return fibonac(n-1) +  fibonac(n-2);
    }
}