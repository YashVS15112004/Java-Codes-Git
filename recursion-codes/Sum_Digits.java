import java.util.Scanner;

public class Sum_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        System.out.println("The sum is ::"+" "+sum_digits(n,0));

    }
    static int sum_digits(int n,int sum)
    {
        if(n<10)
        {
            sum+=n;
            return sum;
        }
        else {
            int rem = n%10;
            sum+=rem;
            return sum_digits(n/10,sum);
        }
    }
}
