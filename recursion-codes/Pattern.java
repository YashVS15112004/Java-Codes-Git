import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows::");
        int  r = in.nextInt();
        //pattern_1(r,0);
        pattern_2(r,0);
        in.close();
    }
    static int n = 1;
    static void pattern_1(int r,int c)
    {
        if(r==0){
            return;
        }
        if(c<r)
        {
            System.out.print("*");
            pattern_1(r, c+1);
        }
        else{
            System.out.println();
            pattern_1(r-1,0);
        }
    }
    static void pattern_2(int r,int c)
    {
        if(n==r+1){
            return;
        }
        if(c<n)
        {
            System.out.print("*");
            pattern_2(r, c+1);
        }
        else{
            System.out.println();
            n++;
            pattern_2(r,0);
        }
    }
}

