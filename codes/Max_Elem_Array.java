import java.util.Scanner;
public class Max_Elem_Array {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements ::");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the elements ::");

        int[] arr = new int[n];

        for (int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        int largest = max(arr,n);

        System.out.print("The maximum element is ::"+" "+largest);
        in.close();
    }

    static int max(int[] arr2,int n)
    {
        int max=0;
        for (int i =0;i<n;i++){
            int largest = arr2[i];
            for( int j=i+1;j<n;j++)
            {
                if(largest<arr2[j])
                {
                    largest=arr2[j];
                    max=largest;
                }
            }

        }
        return max;
    }
}
