package 算法题;

public class likou191 {
    public static void main(String[] args) {
     String n="00000000000000000000000000001011";
        int n1 = Integer.parseInt(n);
        int i = hammingWeight(n1);
        System.out.println(i);
    }
    public static int hammingWeight(int n){
        String s = String.valueOf(n);
        int nums=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                nums++;
            }
        }
        return nums;

    }
}
