package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Shankar on 10/20/2016.
 */
public class BinarySearch {
    public static void main(String[] args) {
        //int[] mArray = {1,34,4,23,95,42,58,3,38,94};
        int[] mArray = {1,4,23,42,58,63,75,88,94};
        System.out.println("The original array is " + Arrays.toString(mArray));

        System.out.println("Please enter the number you want to search for: ");
        Scanner conIn = new Scanner(System.in);
        int value = conIn.nextInt();

        System.out.println("With linear search, the rusult is \"" + linearSearch(mArray,value) + "\"");
        System.out.println("With binary iterative search, the rusult is \"" + binarySearchIter(mArray,value) + "\"");
        System.out.println("With binary recursive search, the rusult is \"" + binarySearchRec(mArray,value) + "\"");

    }

    // linear search
    public static boolean linearSearch(int[] numArray, int value){
        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i] == value)
                return true;
        }
        return false;
    }

    // iterative binary search
    public static boolean binarySearchIter(int[] numArray, int value){
        int first = 0;
        int last = numArray.length-1;

        while (first <= last){
            int mid = (first + last)/2;

            if(value < numArray[mid])
                last = mid -1;
            else if (value > numArray[mid])
                first = mid +1;
            else
                return true;
        }

        return false;
    }

    // recursive helper method for binarySearchRec
    public static boolean binarySearchRecHelper(int[] numArray, int value, int first, int last){
        if(first > last)
            return false;

        int mid = (first + last)/2;

        if(value < numArray[mid])
            return binarySearchRecHelper(numArray, value, first, mid-1);
        else if(value > numArray[mid])
            return binarySearchRecHelper(numArray, value, mid+1, last);
        else
            return true;
    }

    // recursive binary search
    public static boolean binarySearchRec(int[] numArray, int value){
        return binarySearchRecHelper(numArray, value, 0, numArray.length-1);
    }
}
