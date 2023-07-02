import com.sun.jdi.CharValue;

import java.util.Scanner;
public class First_Ucase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char ch = ucase(str,0);
        System.out.println(ch);
    }
    static char ucase(String str,int start)
    {
        if(((int)str.charAt(start)>=65)&&((int)str.charAt(start)<=90))
        {
            return str.charAt(start);
        }
        else {
            return ucase(str,start+1);
        }
    }
}
