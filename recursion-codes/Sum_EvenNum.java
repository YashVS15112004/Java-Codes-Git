import java.util.Scanner;

public class Sum_EvenNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter even number::");
        int n = in.nextInt();
        if(n%2==0)
        {
            System.out.println("The sum is::"+" "+even_sm(n,0));
        }
        else{
            System.out.println("Enter a even number!!");
        }
        in.close();
    }
    static int even_sm(int n,int sum)
    {
        if(n==2){
            sum+=n;
            return sum;
        }
        else{
            sum+=n;
            return even_sm(n-2,sum);
        }
    }
}
