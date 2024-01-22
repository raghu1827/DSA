package Stack;

public class Runner 
{
     public static void main(String[] args)
    {
        Stack nums= new  Stack();

        // //checking isEmpty() before push
        System.out.println("is Empty "+ nums.isEmpty());

        System.out.println();

        //if try to pop empty stack then it will give message as 'stack is empty'
        // System.out.println("pop element is "+ nums.pop());


        //pushing the elements inside stack
        nums.push(15);
        nums.push(8);
        nums.push(10);
        nums.push(7);
        nums.push(12);

        //if you again push a element it will give 'stack is full' message
        nums.push(100);
     

        //agian checking isEmpty()
        System.out.println("is Empty "+ nums.isEmpty());

        System.out.println();

        //peeking the elements
        System.out.println("peek element is "+ nums.peek());
      
        System.out.println();
        
        //poping the element
        System.out.println("pop element is "+ nums.pop());

        System.out.println();

        //checking the size of element
        System.out.println("size is "+ nums.size());

        //showing the all the operations
        nums.show();
    }
}
