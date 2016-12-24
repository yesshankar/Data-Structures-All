package LeetCode;

/**
 * Created by Shankar on 10/1/2016.
 */
public class Solution {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,};
        int m = 2;
        int max = nums[0] + nums[1];

        if(m == 1){
            max = nums[0];
        }
        else if (m == 2){
            if (nums.length == 2) {
                if (nums[0] > nums[1]) {
                    max = nums[1];
                } else {
                    max = nums[0];
                }
            } else {
                int fPart = 0;
                int sPart = 0;

                for (int i = 2; i < nums.length-2; i++) {
                    fPart = sum(nums,0,i);
                    sPart = sum(nums, i, nums.length);

                    if(fPart > sPart){
                        if(fPart < max){
                            max = fPart;
                        }
                    }else{
                        if(sPart < max){
                            max = sPart;
                        }
                    }

                }

            }
        }
        else {
            max = small(nums);
        }

        System.out.println("Max : " + max);

    }
    public static int sum(int[] arr, int st, int end) {

        int tSum = 0;

        for (int i = st; i < end ; i++) {
            tSum += arr[i];
        }

        return tSum;
    }

    public static int small(int[] nums){
        int sMax = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(sMax > nums[i]){
                sMax = nums[i];
            }
        }
        return sMax;
    }


        /*
        String s = "abccccdd";
        int count = 0;
        int extra = 0;
        char[] words = s.toCharArray();
        java.util.Arrays.sort(words);

        for (int i = 0; i < s.length()-1; i++) {

            if(words[i] == words[i+1]){
                count++;
                i++;
            }
            else {
                extra = 1;
            }

        }

        System.out.println("Max palindrone length : " + (count * 2 + extra));
        */

}
