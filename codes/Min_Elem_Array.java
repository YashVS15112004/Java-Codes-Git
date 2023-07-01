import java.util.Scanner;

public class Min_Elem_Array {
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

            int smallest = min(arr,n);

            System.out.print("The minimum element is ::"+" "+smallest);

        }

        static int min(int[] arr2,int n)
        {
            int min=0;
            for (int i =0;i<n;i++){
                int smallest = arr2[i];
                for( int j=i+1;j<n;j++)
                {
                    if(smallest>arr2[j])
                    {
                        smallest=arr2[j];
                        min=smallest;
                    }
                }

            }
            return min;
        }
    }

