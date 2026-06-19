package LeetCode;

import java.util.Arrays;

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
//Example 1:
//
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
//Example 2:
//
//Input: nums = [1,2,3,4,4,3,2,1], n = 4
//Output: [1,4,2,3,3,2,4,1]
//Example 3:
//
//Input: nums = [1,1,2,2], n = 2
//Output: [1,2,1,2]
public class ShuffleTheArray {
    static void main() {
        System.out.println(Arrays.toString(new ShuffleTheArray().shuffle(new int[]{1, 3, 4, 5}, 2)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] mass1 = new int[n];
        int[] mass2 = new int[n];
        System.arraycopy(nums, 0, mass1, 0, n);
        System.arraycopy(nums, n, mass2, 0, n);
        for (int i = 0, k = 0; i < nums.length; i += 2) {
            nums[i] = mass1[k];
            nums[i + 1] = mass2[k];
            k++;
        }
        return nums;
    }
}
