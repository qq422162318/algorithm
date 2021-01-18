package 数据结构.栈;

public class SymbolTableTest {
    public static void main(String[] args) {
        SymbolTable<Integer,String> st=new SymbolTable<>();
        st.put(1,"乔峰");
        st.put(2,"虚竹");
        st.put(3,"段誉");

        System.out.println("插入完毕,个数为"+st.size());
        st.put(2,"慕容复");
        System.out.println("键2对应的值为"+st.get(2));
        st.delete(2);
        System.out.println("剩余元素为+"+st.size());
    }
}
