public class All_Armstrong_Number {
    public static void main(String[] args) {
        System.out.println("The 3 digit armstrong numbers are::");
        for (int n = 100; n <= 999; n++) {
            boolean ans = arms(n);
            if(ans==true)
            System.out.println(n);
        }
    }
    static boolean arms(int n) {
        int s = 0;
        int org = n;
        while (n != 0) {
            int r = n % 10;
            int x = r * r * r;
            s += x;
            n = n / 10;
        }
        if (org == s) {
            return true;
        }
        else {
            return false;
        }
    }
}


