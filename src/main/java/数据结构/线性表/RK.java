package 数据结构.线性表;

public class RK {
    public int rk(String t,String p){
        if (t==null||t.length()==0||p.length()==0||p==null||p.length()>t.length()){
            return -1;
        }
        int hash=hash(p,26,31,0,p.length());
        for (int i=0;i<t.length();i++){
            if (hash(t,26,31,i,p.length())==hash&&match(t,p,i)){
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param string
     * @param R 进制数
     * @param K 将字符串映射到K的范围
     * @param start 从string串的start位置开始
     * @param len 字串的长度
     * @return
     */
    private int hash(String string,int R,int K,int start,int len){
        int hash=0;
        for (int i = start; i < start + len; i++) {
            hash=(R*hash+string.charAt(i)%K);
        }
        return hash%K;
    }
    private boolean match(String t,String p,int pos){
        for (int j=0;j<p.length();j++){
            if (p.charAt(j)!=t.charAt(j+pos)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test="abcef";
        String sub="e";
        RK rk=new RK();
        int rk1 = rk.rk(test, sub);
        System.out.println(rk1);

    }
}
