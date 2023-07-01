import java.util.Arrays;
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of characters::");
        int n = in.nextInt();
        char[] str = new char[n];
        for(int i=0;i<n;i++)
        {
            str[i]=in.next().charAt(i);
        }
        System.out.println(Arrays.toString(str));
        //char[] rstr = rev(str);
        //System.out.println(rstr);
    }
    //
}
