import java.util.Scanner;

public class LCM {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number::");
            int a = in.nextInt();
            System.out.print("Enter the second number::");
            int b = in.nextInt();
            int gcd = hcf(a,b);
            int ans = lcm(a,b,gcd);
            System.out.println(ans);
        }
        static int hcf(int a,int b)
        {
            if(a==0)
            {
                return b;
            }
            else{
                return hcf(b%a,a);
            }
        }
        static int lcm(int a,int b,int gcd)
        {
            int lcm = (a*b)/gcd;
            return lcm;
        }
}

