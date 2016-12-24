package Stacks;

/**
 * Created by Shankar on 9/13/2016.
 */
// The test driver for the NumberStack ADT implementation
public class TestNumberStack {
    public static void main(String[] args) {
        try {
            NumberStack mystack = new ArrayNumberStack(5);
            mystack.push(100);
            mystack.push(50);
            mystack.push(70);
            mystack.push(23);
            mystack.push(19);

            System.out.println(mystack);
            System.out.println("Is the stack empty? " + mystack.isEmpty());
            System.out.println("Is the stack full? " + mystack.isFull());
            System.out.println("size() returns " + mystack.size());

            mystack.pop();
            mystack.pop();
            mystack.push(3);
            System.out.println(mystack);
        }
        catch (RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
