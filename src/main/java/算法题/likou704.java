package 算法题;

import java.util.Arrays;

public class likou704 {
    public static void main(String[] args) {
//        int[] nums = {-1,0,3,5,9,12};
        int[] nums = {1,2,2,2,3};
        likou704 likou = new likou704();
//        System.out.println(likou.search(nums, 9));
        System.out.println(likou.searchRight(nums, 2));
    }
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;

        while (left<=right){
            int mid=(left+right)>>1;
            if (nums[mid]==target)return mid;
            else if (nums[mid]>target) right=mid-1;
            else if (nums[mid]<target) left=mid+1;
//            if (nums[mid]>target) right=mid-1;
//            else if (nums[mid]<target) left=mid+1;
//            else return mid;
        }

        return -1;
    }
    //求数组中比target小的数有多少
    public int searchLeft(int[] nums, int target) {
        int left=0,right=nums.length;

        while (left<right){
            int mid=(left+right)>>1;
            if (nums[mid]==target) right=mid;
            else if (nums[mid]<target) left=mid+1;
            else if (nums[mid]>target) right=mid;
        }

        if (left==nums.length)return -1;
        return nums[left]==target?left:-1;
    }
    public int searchRight(int[] nums, int target) {
        int left=0,right=nums.length;

        while (left<right){
            int mid=(left+right)>>1;
            if (nums[mid]==target) left=mid+1;
            else if (nums[mid]<target) left=mid+1;
            else if (nums[mid]>target) right=mid;
        }

        if (left==0)return -1;
        return nums[left-1]==target?(left-1):-1;
    }
    public int search2(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        if (i>=0){
            return i;
        }else {
            return -1;
        }
    }
}
