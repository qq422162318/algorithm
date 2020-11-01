package 算法.线性表;

public class LinkListTest2 {
    public static void main(String[] args) {
        LinkList<String> s1=new LinkList<>();
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("麦迪");
        s1.insert(1,"詹姆斯");

        for (int i=0;i<4;i++) {
            System.out.println(s1.get(i));
        }
        System.out.println("---------------------------");
        s1.reverse();
        for (int i=0;i<4;i++) {
            System.out.println(s1.get(i));
        }
    }
}
