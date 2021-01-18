package 算法题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class likou18 {
    public static void main(String[] args) {
        int[] nums = {-4,-3,1, 0, -1,3,4, 0, -2, 2};
        Arrays.sort(nums);
        int len = nums.length-3,target=0;
        int left,right,ans,response;
        List<List<Integer>> list=new ArrayList<>();
        response=nums[0]+nums[1]+nums[2]+nums[3];
        for (int i = 0; i <len ; i++) {
            if (i>0&&nums[i]==nums[i-1])continue;
            for (int j=0;j<nums.length-1;j++) {
                left = i + 1;
                right = nums.length - 1;
                while (left < right) {
                    ans = nums[i] + nums[left] + nums[left + 1] + nums[right];
                    if (ans == target) {
                        if (list.contains(Arrays.asList(nums[i], nums[left], nums[left + 1], nums[right]))){
                            break ;
                        }else{
                            list.add(Arrays.asList(nums[i], nums[left], nums[left + 1], nums[right]));
                        }
                    }
                    if (Math.abs(ans - target) < Math.abs(response - target)) {
                        response = ans;
                        System.out.println(response);
                    }
                    if (Math.abs(ans - target) > target) {
                        right--;
                    } else if (Math.abs(ans - target) < target) {
                        left++;
                    } else {
                        response = ans;

                    }
                }
            }
        }
        System.out.println(list);
    }}