import java.util.Scanner;
public class Sieve_Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        boolean[] nlist = new boolean[n+1];
        prime(n,nlist);
        // false in arrays means the element is false.
    }
    static void prime(int n,boolean[] nlist)
    {
        for (int i=2;i*i<=n;i++)
        {
            if(!nlist[i])
            {
                for (int j = 2*i;j<=n;j+=i)
                {
                    nlist[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(!nlist[i])
            {
                System.out.print(i+" ");
            }
        }
    }
}
