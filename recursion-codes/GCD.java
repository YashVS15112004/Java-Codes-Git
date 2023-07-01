import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers::");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if(n1>n2)
        {
            int temp=n1;
            n1=n2;
            n2=temp;
        }
        System.out.println("The gcd is::"+cal_gcd(n1,n2));
    }
    static int cal_gcd(int n1,int n2)
    {
        if(n2%n1==0)
        {
            return n1;
        }
        else {
            int rem=n2%n1;
            n2=n1;
            n1=rem;
            return cal_gcd(n1,n2);
        }
    }
}
