package 算法题;

public class water {
    public static void main(String[] args) {
        int[] water={1,8,6,2,5,4,8,3,7};
        int l=0,r=water.length-1,ans=0,area=0;
        while(l<r){
            area=Math.max(water[l],water[r])*(r-l);
            ans=Math.max(ans,area);
            if (water[l]<water[r]){
                l++;
            }else {
                r--;
            }

        }
        System.out.println(ans);
    }
}
