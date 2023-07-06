import java.util.Scanner;

public class Sum_n_to_1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        System.out.print("The sum is ::"+sum(n,0));
        in.close();
    }
    static int sum(int n,int sm)
    {
        if(n==0)
        {
            return sm;
        }
        else{
            sm+=n;
            return sum(n-1,sm);
        }
    }
}