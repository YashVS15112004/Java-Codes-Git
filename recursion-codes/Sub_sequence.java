import java.util.ArrayList;
import java.util.Scanner;
public class Sub_sequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p = new String();
        System.out.print("Enter the string::");
        p = in.nextLine();
        System.out.println("The subsequences are::"+sub_seq("", p));
        in.close();
    }
    static ArrayList<String> sub_seq(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            // Returns final answer.
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = sub_seq(p+ch, up.substring(1));
        ArrayList<String> right = sub_seq(p, up.substring(1));
        // Combines answers from below calls.
        left.addAll(right);
        return left;
    }
}
