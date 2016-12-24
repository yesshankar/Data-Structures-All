package Numbers;

/**
 * Created by Shankar on 9/6/2016.
 */

// The LNode class that represents a node in linked lists

public class LNode {
    // instance variables
    private int m_value;
    private LNode m_link;

    // constructor
    public LNode(int value){
        m_value = value;
        m_link = null;
    }

    // member methods

    public LNode getM_link() {
        return m_link;
    }

    public void setM_link(LNode link) {
        m_link = link;
    }

    public int getInfo(){
        return m_value;
    }
}
