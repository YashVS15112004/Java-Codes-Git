import java.util.Scanner;

public class Product_Digits {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        System.out.print("The product is::"+prd(n,1));
        in.close();
    }
    static int prd(int n,int p)
    {
        if(n==1)
        {
            return p;
        }
        else{
            int r = n%10;
            p*=r;
            return prd(n/10,p);
        }
    }
}
