import java.util.Scanner;

public class Rev2DArr_Bitwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows::");
        int r = in.nextInt();
        System.out.print("Enter the number of cols::");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        for(int i =0;i<r;i++)
        {
            for(int j=0;j<c/2;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[i][c-j-1];
                arr[i][c-j-1]=temp;
            }
        }
        System.out.println("Reverse Array::");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[][] rev_arr = rev(arr,r,c);
        System.out.println("Image Matrix::");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(rev_arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] rev(int[][] arr,int r,int c)
    {
        int[][] n_arr = new int[r][c];
        for(int i =0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=arr[i][j]^1;
            }
        }
        return arr;
    }
}
