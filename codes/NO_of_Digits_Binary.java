import java.util.Scanner;
public class NO_of_Digits_Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int x = 2;
        int number = (int)(Math.log(a) / Math.log(x)) +1;
        System.out.println(number);
        in.close();
    }
}
