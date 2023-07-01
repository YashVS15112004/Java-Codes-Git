public class No_Of_Set_Bits {
    public static void main(String[] args) {
    int n = 9;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
}
private static int setBits(int n) {
        int count = 0;

//        while (n > 0) {
//            count++;
//            n -= (n & -n);
//        }

        while (n > 0) {
            count++;
            n = n & (n - 1);
            System.out.println(Integer.toBinaryString(n));
        }

        return count;
    }

}
