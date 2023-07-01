import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        facts(n);
    }
    static void facts(int n)
    {

        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.print(n);
    }
}
