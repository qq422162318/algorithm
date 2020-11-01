package Jvm;

import java.util.ArrayList;

public class setmemory {
    private static final int _512KB=512*1024;
    private static final int _1MB=1024*1024;
    private static final int _6MB=6*1024*1024;
    private static final int _7MB=7*1024*1024;
    private static final int _8MB=8*1024*1024;
    private static final int _10MB=10*1024*1024;
    //-Xms20M -Xmx20M -Xmn10M -XX:+UseSerialGC -XX:+PrintGCDetails _verbose:gc
    public static void main(String[] args) {
        ArrayList<byte[]> list=new ArrayList<>();
        list.add(new byte[_10MB]);
    }
}
