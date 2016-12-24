package Queue;

/**
 * Created by Shankar on 9/27/2016.
 */
public interface NumberQueue {
    boolean isEmpty();      // check whether the queue is empty
    boolean isFull();       // check whether the queue is full
    void enqueue(int v);    // add an element to the rear of the queue
    int dequeue();          // remove and return the elements at the front of the queue
    int size();             // return the size of the queue


}
