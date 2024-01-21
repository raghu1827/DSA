public class LinearSearch {

    public static int search(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    
    //main()
    public static void main(String[] args) 
    {
        int arr[]={3,2,8,4,6,1};
        int target=67;

        int result=search((arr), target);
        if(result==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key found at index "+result);
        }
    }
    
}
