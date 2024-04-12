/**
 * MaximumSumOfDistinctSubarraysWithLengthK
 */
import java.util.*;
import java.lang.*;

public class MaximumSumOfDistinctSubarraysWithLengthK {

    public static int maximumSubarraySum(int[] nums, int k){
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            ans += nums[i];
        }

        if(max < ans) max = ans;

        for(int i=k; i<nums.length; i++){
            ans -= nums[i-k];
            ans += nums[i];
            if(max < ans){
                max = ans;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums ={1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }
}