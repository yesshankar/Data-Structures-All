package Sorting;

import java.util.Arrays;

/**
 * Created by Shankar on 11/8/2016.
 */

// Sorting and searching algorithm implementation
public class SortingSearchingAlgs {
    public static void main(String[] args) {
        int[] myArrray = {10, 20, 5, 3, 17, 14, 25, 18, 9, 6, 15, 4, 13};
        System.out.println("The original array is " + Arrays.toString(myArrray));

        int[] testArray = myArrray.clone();
        selectionSort(testArray);
        System.out.println("The array sorted by Selection sort is " + Arrays.toString(testArray));

        testArray = myArrray.clone();
        mergeSort(testArray);
        System.out.println("The array sorted by Merge sort is " + Arrays.toString(testArray));

        testArray = myArrray.clone();
        quickSort(testArray);
        System.out.println("The array sorted by Quick Sort is " + Arrays.toString(testArray));
    }

    // find the index of the smallest element in the specified range
    public static int minIndex(int[] numArray, int first, int last){
        int indexOfMin = first;

        for (int i = first+1; i <= last; i++) {
            if(numArray[i] < numArray[indexOfMin])
                indexOfMin = i;

        }

        return indexOfMin;
    }

    // selection sort
    public static void selectionSort(int[] numArray){
        int last = numArray.length - 1;

        for (int i = 0; i < last; i++) {
            int indexOfMin = minIndex(numArray, i, last);
            int temp = numArray[i];
            numArray[i] = numArray[indexOfMin];
            numArray[indexOfMin] = temp;
        }
    }

    // merge sort
    public static void mergeSort(int[] numArray){
        mergeSortRec(numArray, 0, numArray.length-1);
    }

    // recursive helper method for mergeSort
    public static void mergeSortRec(int[] numArray, int first, int last){
        if(first < last){
            int midIndex = (first + last)/2;
            mergeSortRec(numArray, first, midIndex);
            mergeSortRec(numArray, midIndex+1, last);
            merge(numArray, first, last);
        }
    }

    // merge two sorted halves into one sorted array
    public static void merge(int[] numArray, int first, int last){
        int midIndex = (first + last)/2;
        int n = last - first + 1;   // size of the region to be merged
        int[] tempArray = new int[n];    // merge both halves into a temp array
        int i1 = first;             // next element to consider in the first half
        int i2 = midIndex + 1;      // next element to consider in the second half
        int j = 0;                  // next open position in the temp array

        // as long as neither i1 nor i2 is past the end, move the smaller element into the temp array
        while(i1 <= midIndex && i2 <= last){
            if(numArray[i1] < numArray[i2]){
                tempArray[j] = numArray[i1];
                i1++;
            }
            else{
                tempArray[j] = numArray[i2];
                i2++;
            }

            j++;

        }

        // copy any remaining elements of the first half
        while(i1 <= midIndex){
            tempArray[j] = numArray[i1];
            i1++;
            j++;
        }

        // copy any remaining elements of the second half
        while(i2 <= last){
            tempArray[j] = numArray[i2];
            i2++;
            j++;
        }

        // copy back them from array
        for(j = 0; j < n; j++){
            numArray[first + j] = tempArray[j];
        }
    }

    // split an array into two subsections, with all the elements less than the pivot in the left subsection and all
    // the elements greater than the pivot in the right subsection
    public static int split(int[] numArray, int first, int last){

        // set the first element as the pivot
        int pivot = numArray[first];
        int pivotIndex = first;

        first++;

        while (true){
            // starting from the left of the array, find the first element that is greater than the pivot
            while(first <= last && numArray[first] <= pivot)
                first++;

            // starting from the right of the array, find the first element that is smaller than the pivot
            while(first <= last && numArray[first] >= pivot)
                last--;

            // swap the two elements
            if (first < last){
                int temp = numArray[first];
                numArray[first] = numArray[last];
                numArray[last] = temp;
            }
            else
                break;
        }

        // swap the pivot with the element at index last
        int temp = numArray[last];
        numArray[last] = numArray[pivotIndex];
        numArray[pivotIndex] = temp;

        return last;
    }

    // recursive helper method for quick sort
    public static void quickSortRec(int[] numArray, int first, int last){

        if(first < last){
            int splitPoint;

            // split the array
            splitPoint = split(numArray, first, last);

            // quick sort the left subsection
            quickSortRec(numArray, first, splitPoint - 1 );

            // quick sort the right subsection
            quickSortRec(numArray, splitPoint + 1, last);
        }
    }

    // quick sort
    public static void quickSort(int[] numArray){
        quickSortRec(numArray, 0, numArray.length - 1);
    }
}
