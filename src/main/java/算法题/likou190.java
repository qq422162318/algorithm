package 算法题;

public class likou190 {
    public static void main(String[] args) {
        Integer b=0b00000010100101000001111010011100;
        int i = reverseBits2(b);
        System.out.println(i);
    }
    public static int reverseBits(int n){
        int res=0;
        for (int i = 0; i <32 ; i++) {
            int bit=n&1;
            res=(res<<1)+bit;
            n>>=1;
        }
        return res;
    }
    public static int reverseBits2(int n){
        long ret=0,power=31;
       while(n!=0){
           int bit=n&1;
           int temp=bit<<power;
           ret+=temp;
           n=n>>1;
           power-=1;
       }
        return (int)ret;
    }
}
