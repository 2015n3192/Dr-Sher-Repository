class Queue
{
    int arr[] = new int[10] ;
    int top = -1 ;
    // this has created an array with top of -1 means
    // array is empty

    public void queueIn ( int num)
    {
        if(top>9)
        {
            System.out.println("Sorry gentleman the queue is full");
        }
        else
        {
            arr[++top] = num ;
            System.out.println("The element is successfully added ") ;
        }

    }

    public int queueOut ()
    {
        int end = -1 ;
        if(top == end)
        {
            System.out.println(" Sorry the array is empty");

        }
        else
        {

            for(int i = 0 ; i < arr.length ; i++)
            {
                end = arr[0] ;
                arr[(i-1)] = arr[i] ;
                top-- ;
            }



        }
        System.out.println ("The element " + first + "is removed") ;
        return first ;
    }
    public void display()
    {
        for(int i = 0 ; i < (arr.length) ; i++)
        {
            System.out.print(arr[i] + "   ") ;
        }
    }
}

public class QueueDemo
{
    public static void main(String args[])
    {
        Queue q1 = new Queue() ;
        q1.display();
        System.out.println() ;
        for(int i = 0 ; i < 10 ; i ++)
        {
            q1.queueIn(i);
        }
        q1.display();
        q1.queueOut();
        q1.display();


    }

}
