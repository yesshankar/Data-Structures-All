package Recursion;

/**
 * Created by Shankar on 9/22/2016.
 */
public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Fibonacci Numbers form Iterative method: ");
        for (int i = 0; i <= 45; i++) {
            if (i%20 == 0)
                System.out.println();

            System.out.print(fibIter(i) + " ");
        }

        System.out.println();

        System.out.println("Fibonacci Numbers form Recursive method: ");
        for (int i = 0; i <= 45; i++) {
            if (i%20 == 0)
                System.out.println();

            System.out.print(fibRec(i) + " ");
        }


    }

    public static int fibRec(int n){
        if (n == 0 || n == 1)
            return 1;
        else
            return fibRec(n-1) + fibRec(n-2);
    }

    public static int fibIter(int n){
        if (n == 0 || n == 1)
            return 1;

        int[] fibNumbers = new int[n+1];
        fibNumbers[0] = fibNumbers[1] = 1;

        for (int i = 2; i <= n ; i++) {
            fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];
        }

        return fibNumbers[n];

    }
}
