package sorting;

import java.util.Scanner;
class SelectionSort{
    public void selectionSort(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(" the sorted array is : - "+arr[i]);
        }
    }
}
public class selection {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print(" Please enter the size of an array : - ");
            int n=sc.nextInt();
            System.out.println();
            System.out.println("please input the array elements : - ");
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(" we are performing selection sort ");
            SelectionSort ss=new SelectionSort();
            ss.selectionSort(arr,n);
        }
}
