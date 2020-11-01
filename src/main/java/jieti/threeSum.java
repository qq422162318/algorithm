package jieti;

import java.util.ArrayList;
import java.util.Arrays;

public class threeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        Arrays.sort(nums);
        System.out.println(nums);
        int len = nums.length,target=1;
       int left,right,ans,response;
       response=nums[0]+nums[1]+nums[2];
        for (int i = 0; i <len-1 ; i++) {
            left=i+1;right=len-1;
            while(left<right){
                ans=nums[i]+nums[left]+nums[right];
                if (Math.abs(ans-target)<Math.abs(response-target)){
                    response=ans;
                    System.out.println(response);
                }
                if (Math.abs(ans-target)>target){
                    right--;
                }
                else if (Math.abs(ans-target)<target){
                    left++;
                }
                else{
                    response=ans;

            }
        }
        System.out.println(response);
    }}}