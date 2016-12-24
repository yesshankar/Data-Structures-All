package Queue;

/**
 * Created by Shankar on 9/29/2016.
 */

// The test driver for the NumberQueue ADT implementation

public class TestNumberQueue {
    public static void main(String[] args) {
        try{
            NumberQueue myq1 = new ArrayNumberQueue(5);
            myq1.enqueue(100);
            myq1.enqueue(50);
            myq1.enqueue(70);
            myq1.enqueue(23);
            myq1.enqueue(19);

            System.out.println(myq1);
            System.out.println("Is the queue empty? " + myq1.isEmpty());
            System.out.println("Is the queye full? " + myq1.isFull());
            System.out.println("dequeue() returns " + myq1.dequeue());
            System.out.println("size() returns " + myq1.size());

            myq1.dequeue();
            myq1.dequeue();
            myq1.enqueue(3);

            System.out.println(myq1);

            System.out.println("size() returns " + myq1.size());


        }
        catch (RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        try{
            NumberQueue myq2 = new LinkedNumberQueue();
            myq2.enqueue(100);
            myq2.enqueue(50);
            myq2.enqueue(70);
            myq2.enqueue(23);
            myq2.enqueue(19);

            System.out.println(myq2);
            System.out.println("Is the queue empty? " + myq2.isEmpty());
            System.out.println("Is the queye full? " + myq2.isFull());
            System.out.println("dequeue() returns " + myq2.dequeue());
            System.out.println("size() returns " + myq2.size());

            myq2.dequeue();
            myq2.dequeue();
            myq2.enqueue(3);

            System.out.println(myq2);

            System.out.println("size() returns " + myq2.size());


        }
        catch (RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
