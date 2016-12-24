package Numbers;

/**
 * Created by Shankar on 9/6/2016.
 */

// The linked list based implementation for the NumberList ADT
public class LinkedNumberList implements NumberList{

    // instance variables
    private LNode m_first;
    private LNode m_last;


    public LinkedNumberList() {
        m_first = null;
        m_last = null;
    }

    // insert a number into the list
    public void insert(int v) {
        // create a new node with the given value
        LNode newNode = new LNode(v);

        /*/ insertion at the front
        newNode.setM_link(m_first);
        m_first = newNode;
        */

        // insertion at the end
        if (m_first == null)
            m_first = m_last = newNode;
        else{
            m_last.setM_link(newNode);
            m_last = newNode;
        }

    }

    // check weather the list is full
    public boolean isFull() {
        return false;
    }

    // check weather a given number exists in the list
    public boolean contains(int v) {
        LNode current = m_first; // temperory node

        while (current != null){
            if (current.getInfo() == v)
                return true;
            else
                current = current.getM_link();
        }
        return false;
    }

    // return a string representation of the list
    @Override
    public String toString(){
        String listContent = "The content of the list is: ";

        LNode current = m_first; // temperory node

        while (current != null){
            listContent += current.getInfo() + " ";
            current = current.getM_link();
        }

        return listContent;
    }
}
