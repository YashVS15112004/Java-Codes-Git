import java.util.Scanner;
public class One_to_n{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number::");
        int n = in.nextInt();
        nums(n,1);
        in.close();
    }
    static void nums(int n,int x)
    {
        if (n<x)
        {          
            return;
        }
        else{
            System.out.print(x+" ");
            nums(n,x+1);
        }
    }
}
