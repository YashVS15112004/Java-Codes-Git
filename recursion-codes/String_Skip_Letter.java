public class String_Skip_Letter{
    public static void main(String[] args) {
        skip("","baccadh");
    }
    static void skip(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a')
        {
            skip(p, up.substring(1));
        }
        else
        {
            skip(p+ch, up.substring(1));
        }
    }
}