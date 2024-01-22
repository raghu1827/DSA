package Stack;

public class Stack 
{
    int stack[]=new int[5];
    int top=0;
    

    //push operation on stack
    public void push(int data)
    {
        if(top==stack.length)
        {
            System.out.println("stack is full");
        }
        else
        {
            stack[top]=data;
            top++;
        }
    }    

     //pop operation in stack
     public int  pop()
     {
         int data=0;

         if(isEmpty())
         {
            System.out.println("stack is empty");
         }
         else
         {
            top--;
            data=stack[top];
            stack[top]=0;
         }
         return data;
        
     }

     public int peek()
     {
        int data;
        data=stack[top-1];
        return data;
     }

     //size of stack
     public int size()
     {
        return top;
     }

     //isEmpty operation
     public boolean isEmpty()
     {
        return top<=0;
     }

     //show operation in stack
    public void show()
    {
        for(int n: stack)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
