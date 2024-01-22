package Queue;

public class Runner 
{
    public static void main(String[] args) 
    {
        Queue q=new Queue();

        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(19);


        // System.out.println(q.isFull());
        // System.out.println("empty :"+ q.isEmpty());

        // System.out.println("size: "+q.getSize());

        q.show(); 
    }
}
