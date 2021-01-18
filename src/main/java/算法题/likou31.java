package 算法题;

import java.util.Arrays;

public class likou31 {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        int[] ints = nextPer(arr);

        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }

    public static int[] nextPer(int[] nums){
        if (nums.length<=2){
           return nums;
        }
        int temp=0;
        int realNum = Integer.parseInt(convert(nums));
        System.out.println("realNum is:"+realNum);
        int enumindex = nums.length-2;
        boolean flag=false;
        while (enumindex>=1){
            if (nums[enumindex]>nums[enumindex+1]){ enumindex--;continue;}
             swap(nums, enumindex, enumindex + 1);
            flag=true;
            int i = Integer.parseInt(convert(nums));
            System.out.println(i);
            if (realNum<i){
              return nums;
            }
            enumindex--;

        }
        if (!flag) Arrays.sort(nums);
        return nums;

    }
    public static String convert(int[] arr){
        String num="";
        for (int i : arr) {
            String s = String.valueOf(i);
            num+=s;
        }
        String s = String.valueOf(num);
        return s;
    }
    public static void swap(int[] nums,int i,int j ){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
}
