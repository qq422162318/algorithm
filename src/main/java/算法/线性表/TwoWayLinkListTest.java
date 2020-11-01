package 算法.线性表;

public class TwoWayLinkListTest {
    public static void main(String[] args) {
        TwoWayLinkList<String> s1=new TwoWayLinkList<>();
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("麦迪");
        s1.insert("詹姆斯");

        for (int i=0;i<s1.length();i++){
            System.out.println(s1.get(i));
        }
        System.out.println("第一个元素是"+s1.getFirst());
        System.out.println("最后一个元素是"+s1.getLast());
        String getResult=s1.get(1);
        System.out.println("获取索引1处的结果:"+getResult);
        String removeResult=s1.remove(0);
        System.out.println("删除元素是:"+removeResult);
        s1.clear();
        System.out.println("清空后的线性表中的元素个数为:"+s1.length());
    }
}



