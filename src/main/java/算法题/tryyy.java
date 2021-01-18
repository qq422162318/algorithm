package 算法题;

import java.util.ArrayList;
import java.util.Iterator;

public class tryyy {
    public static void main(String[] args) {
        int[]  nums = {-1, 0, 1, 2, -1, -4};
        ArrayList<Integer> arr=new ArrayList<>();
        int length = nums.length;
        for (int i=0;i<length-1;i++){
            for (int j=1;j<length-1;j++){
                for (int k=2;k<length-1;k++){
                    if (nums[i]+nums[j]+nums[k]==0){
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                    }
                }
            }
        }
        Iterator<Integer> it=arr.iterator();
        while (true){
            if (it.hasNext()){
                System.out.println(it.next());
            }else {
                break;
            }
        }
    }

}

