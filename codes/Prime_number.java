import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        System.out.print("Enter the number::");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            System.out.println("Neither prime nor composite.");
        } else if (n == 2) {
            System.out.println("Prime");
        } else {
            String ans = prime(n);
            System.out.println(ans);
        }
    }

    static String prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "Not Prime";
            } else {
                continue;
            }
        }
        return "Prime";
    }
}
