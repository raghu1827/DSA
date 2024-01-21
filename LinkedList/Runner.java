package LinkedList;

/**
 * Runner
 */
public class Runner 
{
public static void main(String[] args) 
{
    //creating object of linkedlist class
    LinkedList list=new LinkedList();

    //inserting the data using insert method with object refrence
    list.insert(5);
    list.insert(71);
    list.insert(45);

    list.insertAtStart(10);

    list.insertAt(0,35);

    list.deleteAt(2);
    
    list.show();
}
    
}