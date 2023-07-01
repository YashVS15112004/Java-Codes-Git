import java.util.Scanner;

public class ODD_EVEN_BINARY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        oe(n);
    }
    static void oe(int n)
    {
        if((n&1)==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}

