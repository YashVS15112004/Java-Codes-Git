import java.util.Scanner;

public class Skip_a_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p = new String();
        String s = new String();
        System.out.print("Enter the string::");
        p = in.nextLine();
        System.out.print("Enter the string you want to remove::");
        s = in.nextLine();
        System.out.println("The new string is::"+skip(p,s));
        in.close();
    }
    static String up = new String(); 
    static String skip(String p,String s)
    {
        if(p.isEmpty())
        {
            return up;
        }
        if(p.startsWith(s)){
            return skip(p.substring(s.length()),s);
        }
        else{
            up = up + p.charAt(0);
            p = p.substring(1);
            return skip(p,s);
        }
    }
}
