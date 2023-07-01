import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows::");
        int rows = in.nextInt();
        System.out.print("Enter the number of cols::");
        int cols = in.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.print("Enter the target element::");
        int target = in.nextInt();
        System.out.println("The matrix is::");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[] x = bsearch(arr,target);
        System.out.println("The indexes are::");
        System.out.println(Arrays.toString(x));
    }
    static int[] bsearch(int[][] arr,int target)
    {
        int rstart=0;
        int colstart=0;
        int cend= arr.length;
        int rend=arr.length-1;
        while(rstart<cend)
        {
            if(target<arr[colstart][rend])
            {
                rend--;
                cend--;
            }
            else if(target>arr[colstart][rend])
            {
                colstart++;
            }
            else
            {
               int[] x={colstart,rend};
               return x;
            }
        }
        int[] x ={-1,-1};
        return x;
    }
}
