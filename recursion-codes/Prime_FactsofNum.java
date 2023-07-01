import java.util.Scanner;
public class Prime_FactsofNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        if(prime(n)==1)
        {
            System.out.print(n);
        }
        else {
            System.out.println(num(n,n));
        }
    }
    static int num(int i,int n) {
        // i is constant.
        if (n<3) {
            if(n==2) {
                if (i % n == 0) {
                    return n;
                }
            }
            else{
                return n;
            }
        }
        else {
            if (divis(i,n)==1) {
                if(prime(n)==1)
                {
                    System.out.print(n+" ");
                    return num(i,n-1);
                }
                else {
                    return num(i,n-1);
                }
            }
            else{
                return num(i,n-1);
            }
        }
        return n;
    }
    static int divis(int i,int n)
    {
        if(i%n==0)
        {
            return 1;
        }
        else {
            return 0;
        }
    }
    static int prime(int n)
        {
            int count=1;
            //every number is it's own factor.
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count>1)
            {
                return 0;
            }
            else {
                return 1;
            }
        }
}
