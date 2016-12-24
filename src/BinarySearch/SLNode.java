package BinarySearch;

import java.io.Serializable;

/**
 * Created by Shankar on 10/20/2016.
 */

// The SLNode class that represents nodes
public class SLNode implements Serializable{
    // instance variables
    private int m_values;
    private SLNode m_link;

    // constructor
    public SLNode(int value){
        m_values = value;
        m_link = null;
    }

    // getters and setters

    public int getInfo() {
        return m_values;
    }

    public SLNode getLink() {
        return m_link;
    }

    public void setLink(SLNode link) {
        m_link = link;
    }
}
