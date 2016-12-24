package Numbers;

/**
 * Created by Shankar on 8/30/2016.
 */
public class ArrayNumberList implements NumberList {
    // instance variables
    private int[] m_array;
    private int m_index = 0;

    //constructor
    public ArrayNumberList(int cap){
        m_array = new int[cap];
    }

    //insert a number into the list

    @Override
    public void insert(int v) {
        m_array[m_index] = v;
        m_index++;
    }

    // check wether the list is full

    @Override
    public boolean isFull() {
        if(m_index == m_array.length)
            return true;
        else
            return false;
    }


    public boolean contains(int v){
        for (int i = 0; i < m_index; i++) {
            if (m_array[i] == v)
                return true;

        }
        return false;
    }

    // return a string representation of the list

    public String toString(){
        String listContent = "The content of the list is: ";

        for (int i = 0; i < m_index; i++) {
            listContent += m_array[i] + " ";
        }

        return listContent;
    }








}
