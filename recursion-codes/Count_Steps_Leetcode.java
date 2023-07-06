import java.util.Scanner;

public class Count_Steps_Leetcode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        System.out.print("The steps required are ::"+cstep(n,0));
        in.close();
    }
    static int cstep(int n,int cnt)
    {
        if(n==0)
        {
            return cnt;
        }
        else{
            if(n%2==0)
            {
                cnt++;
                n=n/2;
            }
            else
            {
                cnt++;
                n=n-1;
            }
            return cstep(n, cnt);
        }
    }
}
