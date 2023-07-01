import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string::");
        String text = in.next();
        System.out.println(text);
        int n = text.length();
        boolean ans = false;
        String ltext = text.toLowerCase();
        for(int i=0;i<n/2;i++)
        {
            int len = n-i-1;
            if(ltext.charAt(i)==ltext.charAt(len))
            {
                ans = true;
            }
            else{
                break;
            }
        }
        if(ans)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
