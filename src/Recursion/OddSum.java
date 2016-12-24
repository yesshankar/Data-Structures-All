package Recursion;

/**
 * Created by Shankar on 10/15/2016.
 */
public class OddSum {
    public static void main(String[] args) {
        int[] arr = {1,2,32,45,55,6,73,8,9};
        int position = 4;

        System.out.println("Sum from pos " + position + " to end is :" + oddSum(arr,position));
        System.out.println("Is sum odd? :" + isOddSum(arr,position));

        System.out.println("Using Exclusive OR : " + isSumOdd(arr,position));


    }

    public static boolean isOddSum(int[] array, int pos){
        if(pos == array.length - 1 && array[pos]%2 != 0)
            return true;
        if(pos == array.length - 1 && array[pos]%2 == 0)
            return false;

        if(array[pos]%2 != 0 && isOddSum(array,pos+1))
            return false;
        if(array[pos]%2 != 0 && !isOddSum(array,pos+1))
            return true;
        if(array[pos]%2 == 0 && isOddSum(array,pos+1))
            return true;
        if(array[pos]%2 == 0 && !isOddSum(array,pos+1))
            return false;

        return false;
    }

    public static int oddSum(int[] array, int pos){
        int sum = 0;

        for (int i = pos; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }




    public static boolean isSumOdd(int[] array, int pos){

        if(pos == array.length - 1 && array[pos]%2 != 0)
            return true;
        if(pos == array.length - 1 && array[pos]%2 == 0)
            return false;

        return (array[pos]%2 != 0) ^ isSumOdd(array, pos+1);
    }
}
