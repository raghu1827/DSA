/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) 
    {
        int arr[]={6,5,2,8,9,4};
        int temp=0;

        System.out.println("before sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for(int num:arr)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("after sorting");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}