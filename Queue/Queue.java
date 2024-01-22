package Queue;

public class Queue 
{
    int queue[]=new int[5];
    int size;
    int front;
    int rear;

    //enqueue operation (push method in queue)
    public void enQueue(int data)
    {
        queue[rear] =data;
        rear=(rear+1)%5;
        size++;
    }

    //dequeue operation (pop method in queue)
    public int deQueue()
    {
        int data = queue[front];
        front=(front+1)%5;
        size--;
        return data;
    }

    //showing the all the operation done here
    public void show()
    {
        System.out.print("Element : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(queue[(front+i)%5]+ " ");
        }
        System.out.println();

        for(int n: queue)
        {
            System.out.println(n+" ");
        }
    }

     //getting size of queue
     public int getSize()
     {
         return size;
     }
 
     //checking is Empty
     public boolean isEmpty()
     {
         return size==0;
     }
 
     //checking is full
     public boolean isFull()
     {
         return size==5;
     }
}
