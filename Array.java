import java.util.Arrays;

public class Array {

    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        int arr[]={8,6,4,9,2,7,1};
       
        //accessing the data inside array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();

        int index=search(arr,9);
        if(index==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key found at the index "+ index);
        }
    }
        
}
