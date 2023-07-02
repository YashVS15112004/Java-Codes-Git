import java.util.Scanner;
public class n_to_1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number::");
        int n = in.nextInt();
        nums(n);
    }
    static void nums(int n)
    {
        if (n==0)
        {          
            return;
        }
        else{
            System.out.print(n+",");
            nums(n-1);
        }
    }
}
