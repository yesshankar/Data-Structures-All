package Numbers;

/**
 * Created by Shankar on 8/30/2016.
 */
public interface NumberList {
    void insert(int v); // insert the number to the list
    boolean isFull();
    boolean contains(int v);
    @Override
    String toString();

}
