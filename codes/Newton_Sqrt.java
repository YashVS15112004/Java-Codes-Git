import javax.script.ScriptContext;
import java.util.Scanner;

public class Newton_Sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        double ans =sqrt(n);
        System.out.print(ans);
    }
    static double sqrt(int n)
    {
        double x =n;
        double root;
     while (true)
     {
         root=0.5*(x+(n/x));

         if(Math.abs(root-x)<0.00001)
         {
             break;
         }
         x=root;
     }
     return root;
    }
}
