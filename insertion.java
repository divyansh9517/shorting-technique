package sorting;
import java.util.*;
public class insertion {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the size of array : - ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println(" input the elements if array : - ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" we are performing insertion sort ");
        for(int i=0;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j-1] > arr[j])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j=j-1;
            }
            //5arr[j+1]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
}
