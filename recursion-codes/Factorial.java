import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number::");
        int n = in.nextInt();
        int ans = fact(n);
        System.out.printf("Factorial of %d is :- %d",n,ans);
        in.close();
    }
    static int fact(int n)
    {
        if(n==1)
        {
            return n;
        }
        else{
            return (n* fact(n-1));
        }
    }
    
}
