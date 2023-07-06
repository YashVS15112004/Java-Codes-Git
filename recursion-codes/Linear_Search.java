import java.util.ArrayList;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements::");
        int len = in.nextInt();
        System.out.print("Enter the target element::");
        int target = in.nextInt();
        int [] arr = new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=in.nextInt();
        }
        if(ls(arr,target,0))
        {
            System.out.println("Found!");
            ls_idx(arr, target, 0);
            System.out.println(List);
    }
        else
        {
            System.out.println("Not found!");
        }
        in.close();
    }

    static ArrayList<Integer>List = new ArrayList<>(10);

    static boolean ls(int[] arr,int target,int idx)
    {
        if(idx==arr.length-1)
        {
            return false;
        }
        else
        {
            if(arr[idx]==target)
            {
                return true;
            }
            return ls(arr, target, idx+1);
        }
    }
    static ArrayList<Integer> ls_idx(int[] arr,int target,int idx)
    {
        if(idx==arr.length)
        {
            return List;
        }
        else
        {
            if(arr[idx]==target)
            {
                List.add(idx);
            }
            return ls_idx(arr, target, idx+1);
        }
    }

    /*static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }*/
}
