package 算法.排序;
//字符串匹配BF算法
public class BF {
    public int bf(String t,String p) {
        if (t.length() == 0 || t == null || p.length() == 0 || p == null || t.length() < p.length()) {
            return -1;
        }
        //将字符串转为字符数组
        char[] t_array = t.toCharArray();
        char[] p_array = p.toCharArray();

        //匹配过程
     return match(t_array,p_array);
    }
    private int match(char [] t,char[] p){
        int i=0,j=0,posi=0;
        while (i<t.length&&j<p.length){
            if (t[i]==p[j]){
               j++;i++;
            }else {
                i=i-j+1;
                j=0;
            }
        }
        if (i<=t.length){
            posi=i-p.length;
        }else{
            posi=-1;
        }
        return posi;
    }

    public static void main(String[] args) {
        BF bf=new BF();
        int bf1 = bf.bf("abcd", "cd");
        System.out.println(bf1);
    }
}
