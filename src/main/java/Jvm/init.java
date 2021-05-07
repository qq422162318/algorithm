package Jvm;

public class init {
    private String a="s1";
    {
        b=20;
    }
    private int b=10;
    {
        a="s2";
    }
    public init(String a,int b){
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
        init d=new init("s3",30);
        System.out.println(d.a);
        System.out.println(d.b);
    }

}
