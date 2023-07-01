import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args){
            System.out.print("Enter the number till you want the fibonacci series::");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt() ;
            int a = 0;
            int b = 1;
            int s = 0;
            System.out.println("The fibonacci series is::");
            System.out.print(a+" "+b+" ");
            //System.out.print(b );

            for(int i=1;i<=n-2;i++)
            {
                s=a+b;
                System.out.print(s+" ");
                a=b;
                b=s;
            }
            System.out.println();
            System.out.println("The nth element is::"+s);
        }
    }
