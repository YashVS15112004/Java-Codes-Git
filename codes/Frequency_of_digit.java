import java.util.Scanner;

public class Frequency_of_digit {
    public static void main(String[] args) {
        System.out.print("Enter the number::");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Enter the digit::");
        //Scanner inp = new Scanner(System.in);
        int x = in.nextInt();
        int count = 0;
        while(n!=0)
        {
            int r = n%10;
            if(r==x)
            {
                count++;
            }
            n=n/10;
        }
        System.out.print("The frequency of "+x+" is :: "+count);
    }
}
