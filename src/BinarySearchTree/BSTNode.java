package BinarySearchTree;

/**
 * Created by Shankar on 10/27/2016.
 */
public class BSTNode {
    // instance variables
    private int m_value;
    private BSTNode m_left;
    private BSTNode m_right;

    // constructor
    public BSTNode(int value){
        m_value = value;
        m_left = null;
        m_right = null;
    }

    // getters and seters
    public int getInfo(){
        return m_value;
    }

    public BSTNode getLeft(){
        return m_left;
    }

    public BSTNode getRight(){
        return m_right;
    }

    public void setLeft(BSTNode left){
        m_left = left;
    }

    public void setRight(BSTNode right){
        m_right = right;
    }
}
