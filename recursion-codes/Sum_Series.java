import java.util.Scanner;

public class Sum_Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        if(n>=1)
        {
            System.out.printf("The sum is :: %.3f",num(n,0));
        }
        else{
            System.out.println("Enter valid number::");
        }
    }
    static double num(int n,double sum)
    {
        if(n==1)
        {
            sum+=n;
            return sum;
        }
        else {
            int ft = fact(n);
            double divs = (double)div(n,ft);
            sum+= divs;
            return num(n-1,sum);
        }
    }
    static int fact(int n)
    {
        if(n<2)
        {
            return n;
        }
        else{
            return n*fact(n-1);
        }
    }
    static double div(int n,int ft)
    {
        return (double)(n)/(double)(ft);
    }
}
