package jieti;

public class searchNu {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int i = searchInsert(nums, 7);
        System.out.println(i);
    }
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        for(int j=0;j<nums.length;j++){
            if(target<nums[j])return 0;
            if(nums[j]<target&&target<nums[j+1>nums.length?nums.length:j+1]){
                return j+1>nums.length?nums.length:j+1;
            }
        }
        return 0;
    }
}
