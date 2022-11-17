
import java.util.*;
class BubbleSort
{
    public static void main(String []abc)
    {
        int temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("input the length of array:-");
        int n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("insert at index"+i+" element");
            a[i]=sc.nextInt();
        } 
        System.out.println("unsorted list:-");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (a[i] > a[j])
                {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp; 
                }
            }
        }
        for(int i=0;i<n;i++)
        {
        System.out.println("Selection sort :------the sorted array is :-"+a[i]);
        }
    
        
    }
}
