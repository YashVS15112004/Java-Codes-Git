import java.util.Scanner;

public class Count_Zeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        System.out.printf("The number of zeroes in %d :- %d",n,countz(n,0));
        in.close();
    }
    static int countz(int n,int cnt)
    {
        if(n==0)
        {
            return cnt;
        }
        else
        {
            int r = n%10;
            if(r==0)
            cnt++;
            return countz(n/10, cnt);
        }
    }
}
