public class SelectionSort 
{
    public static void main(String[] args)
    {
        int arr[]={6,5,2,8,9,4};
        int temp=0;
        int minIndex= -1;

        System.out.println("Before sorting");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
       


        //selection sort logic
        for(int i=0;i<arr.length-1;i++)
        {
            minIndex = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minIndex]> arr[j])
                {
                    minIndex = j;
                }  
            }
            //swaping the elements after jth iteration
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

            for(int num:arr)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        

        //printing the after sorting value
        System.out.println("After sorting");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
