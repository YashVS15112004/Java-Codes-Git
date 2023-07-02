import java.util.Scanner;

public class Sum_Firstn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        System.out.println("The sum is"+" "+sum(n,0));
        in.close();
    }
    static int sum(int i,int sm)
    {
        if(i<1)
        {
            return sm;
        }
        else {
            sm+=i;
            return sum(i-1,sm);
        }
    }
}
