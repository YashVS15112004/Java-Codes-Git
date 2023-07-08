import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number::");
        int a = in.nextInt();
        System.out.println("Enter the second number::");
        int b = in.nextInt();
        int ans = hcf(a,b);
        System.out.println(ans);
        in.close();
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
}
