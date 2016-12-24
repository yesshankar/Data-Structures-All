package Queue;

/**
 * Created by Shankar on 9/27/2016.
 */
// The array based implementation for the NumberQueue ADT

public class ArrayNumberQueue implements NumberQueue {

    // instance variables
    private int[] m_array;
    private int m_front = 0;
    private int m_rear = -1;
    private int m_numElements = 0;

    // constructor
    public ArrayNumberQueue(int cap){
        m_array = new int[cap];
    }

    // check whether the queue is empty
    public boolean isEmpty() {
        if(m_numElements == 0)
            return true;
        else
            return false;
    }

    // check whether the queue is full
    public boolean isFull() {
        if(m_numElements == m_array.length)
            return true;
        else
            return false;
    }

    // add an element to the rear of the queue
    public void enqueue(int v) {
        if(isFull())
            throw new RuntimeException("Enque atempted on a full queue");
        else{
            m_rear = (m_rear + 1)% m_array.length;
            m_array[m_rear] = v;
            m_numElements++;
        }

    }

    // remove and return the element at the front of the queue
    public int dequeue() {
        int temp = 0;
        if(isEmpty())
            throw new RuntimeException("Deque attempted on an empty queue");
        else{
            temp = m_array[m_front];
            m_front = (m_front + 1) % m_array.length;
            m_numElements--;
        }
        return temp;
    }

    // returns the size of the queue
    public int size() {
        return m_numElements;
    }

    // returns a string representation of the queue
    @Override
    public String toString(){
        String queueContent = "The content of the queue is: ";

        if(!isEmpty()){
            if(m_front <= m_rear){
                for (int i = m_front; i <= m_rear; i++) {
                    queueContent += m_array[i] + " ";

                }
            }
            else{
                for (int i = m_front; i < m_array.length; i++) {
                    queueContent += m_array[i] + " ";

                }
                for (int i = 0; i <= m_rear ; i++) {
                    queueContent += m_array[i] + " ";

                }
            }
        }

        return queueContent;
    }
}
