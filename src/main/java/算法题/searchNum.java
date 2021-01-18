package 算法题;

public class searchNum {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int index=search(arr,0);
        System.out.println(index);
    }
    public static Integer search(int[] num,int target){
        boolean flag=false;
        for (int i = 0; i < num.length; i++) {
            if (num[i]==target){
                flag=true;
                return i;      }
            if (flag){
                return -1;
        }

        }
        return null;
    }
}
