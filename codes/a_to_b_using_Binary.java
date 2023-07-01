import java.util.Scanner;

public class a_to_b_using_Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 2;
        int power = 4;
        int ans = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println(ans);
    }
}
