    import java.util.ArrayList;
import java.util.Scanner;
public class ASCII_Subsequence{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p = new String();
        System.out.print("Enter the string::");
        p = in.nextLine();
        //sub_seq_ASCII("", p);
        System.out.println("The subsequences are::"+sub_seq_rASCII("", p));
        in.close();
    }
    static void sub_seq_ASCII(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub_seq_ASCII(p+ch, up.substring(1));
        sub_seq_ASCII(p, up.substring(1));
        sub_seq_ASCII(p+(ch+0), up.substring(1));
    }
    static ArrayList<String> sub_seq_rASCII(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            // Returns final answer.
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = sub_seq_rASCII(p+ch, up.substring(1));
        ArrayList<String> second = sub_seq_rASCII(p, up.substring(1));
        ArrayList<String> third = sub_seq_rASCII(p+(ch+0), up.substring(1));
        // Combines answers from below calls.
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
