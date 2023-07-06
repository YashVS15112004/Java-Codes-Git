import java.util.Scanner;

public class Reverse_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        int len = n_dig(n,0);
        System.out.println("The reverse is::"+rev(n,len-1,0));
        in.close();
    }
    static int rev(int n,int len,int rn)
    {
        if(n==0)
        {
            return rn;
        }
        else
        {
            int r = n%10;
            rn += (r*(int)Math.pow(10, len));
            return rev(n/10, len-1, rn);
        }

    }
    static int n_dig(int n,int cnt)
    {
        if(n==0)
        {
            return cnt; 
        }
        else
        {
            cnt++;
            return n_dig(n/10, cnt);
        }
    }
}
