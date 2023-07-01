import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        System.out.print("Enter the number::");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = arms(n);
        System.out.println(ans);
    }
    static boolean arms(int n) {
        int s = 0;
        int org = n;
        while (n != 0) {
            int r = n % 10;
            int x = r * r * r;
            s += x;
            n = n / 10;
        }
        if (org == s) {
            return true;
        }
        else {
            return false;
        }
    }
}
