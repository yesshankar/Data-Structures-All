package BinarySearch;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * Created by Shankar on 10/25/2016.
 */
public class TestSortedList {
    public static void main(String[] args) {
        SortedList mylist = new SortedList();
        Scanner conIn = new Scanner((System.in));

        System.out.println("Please enter the number that you want to insert (enter -1 to stop)");

        // read in the numbers and insert into the list
        while(true){
            int value = conIn.nextInt();
            if(value != -1){
                mylist.add(value);
            }
            else
                break;
        }

        // print out the list
        System.out.println(mylist);

        // remove numbers from the list
        System.out.println("Please enter the number that you want to remove: ");
        int vDelete = conIn.nextInt();

        if(mylist.remove(vDelete))
            System.out.println(mylist);
        else
            System.out.println("The number does not exist.");

        // write the list content to file

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SortedList.txt"));
            out.writeObject(mylist);
            out.close();
        }
        catch (Exception e){
            System.out.println("Error occured: " + e.getMessage());
        }

        // read the list content to file

        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("SortedList.txt"));
            mylist = (SortedList) in.readObject();
            in.close();
        }
        catch (Exception e){
            System.out.println("Error occured: " + e.getMessage());
        }
    }
}
