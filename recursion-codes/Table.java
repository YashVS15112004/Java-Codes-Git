import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = in.nextInt();
        System.out.printf("The table of %d is::\n",n);
        table(n,1);
        in.close();
    }
    static int table(int n,int i)
    {
        if(i==10)
        {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
            return n;

        }
        else{
            System.out.printf("%d X %d = %d\n",n,i,n*i);
            i=i+1;
            return table(n,i);
        }
    }
}
