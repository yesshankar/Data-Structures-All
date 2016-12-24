package BinarySearchTree;

import java.util.Scanner;

/**
 * Created by Shankar on 10/27/2016.
 */
public class TestBST {

    public static void main(String[] args) {
        BST mytree = new BST();
        Scanner conIn = new Scanner(System.in);
        int value;

        System.out.println("Please enter the number that you want to add to the tree (enter -1 to stop)");

/*        while(true){
            value = conIn.nextInt();

            if(value != -1)
                mytree.add(value);
            else
                break;
        }
        System.out.println();
*/
        mytree.add(5);
        mytree.add(8);
        mytree.add(15);
        mytree.add(2);
        mytree.add(88);

        System.out.println("Size of the tree is: " + mytree.size());
        mytree.inOrder();
        System.out.println(mytree.contains(44));

    }
}
