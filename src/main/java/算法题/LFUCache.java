package 算法题;

import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * LFU每次淘汰那些使用次数最少的数据
 */
public class LFUCache {
    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(2);
        lfuCache.put(1,1);
        lfuCache.put(2,2);
        System.out.println(lfuCache.get(1));
        lfuCache.put(3,3);
        System.out.println(lfuCache.get(2));
        System.out.println(lfuCache.get(3));
        lfuCache.put(4,4);
        System.out.println(lfuCache.get(1));
        System.out.println(lfuCache.get(3));
        System.out.println(lfuCache.get(4));
    }
    // key 到 val 的映射，我们后文称为 KV 表
    HashMap<Integer,Integer> keyToVal;
    // key 到 freq 的映射，我们后文称为 KF 表
    HashMap<Integer,Integer> keyToFreq;
    // freq 到 key 列表的映射，我们后文称为 FK 表
    HashMap<Integer, LinkedHashSet<Integer>> freqToKeys;
    int minFreq;
    private int cap;
    public LFUCache(int cap){
      keyToVal=new HashMap<>();
      keyToFreq=new HashMap<>();
      freqToKeys=new HashMap<>();
      this.cap=cap;
      this.minFreq=0;
    }
    public int get(int key){
        if (!keyToVal.containsKey(key))return -1;
        increaseFreq(key);
       return keyToVal.get(key);
    }

    private void increaseFreq(int key) {
        int freq = keyToFreq.get(key);
        freqToKeys.get(freq).remove(key);
        int isAddEnd=freq+1;
        keyToFreq.put(key,isAddEnd);
        freqToKeys.putIfAbsent(isAddEnd,new LinkedHashSet<>());
        freqToKeys.get(isAddEnd).add(key);
        // 如果 freq 对应的列表空了，移除这个 freq
        if (freqToKeys.get(freq).isEmpty()){
            freqToKeys.remove(freq);
            if (freq==this.minFreq){
                this.minFreq++;
            }
        }
    }

    public void put(int key,int val){
        if (this.cap<=0)return ;
        if (keyToVal.containsKey(key)){
            keyToVal.put(key,val);
            increaseFreq(key);
            return;
        }
        /* key 不存在，需要插入 */
        /* 容量已满的话需要淘汰一个 freq 最小的 key */
        if (this.cap<=keyToVal.size()){
            removeMinFreqKey();
        }
        keyToVal.put(key,val);
        keyToFreq.put(key,1);
        freqToKeys.putIfAbsent(key,new LinkedHashSet<>());
        //有之前的点击次数为空导致linkedhashset被清除的情况
        if(freqToKeys.get(1)==null){
            freqToKeys.putIfAbsent(1,new LinkedHashSet<>());
        }
        freqToKeys.get(1).add(key);
        this.minFreq=1;
    }

    private void removeMinFreqKey() {
        LinkedHashSet<Integer> rkeyList = freqToKeys.get(this.minFreq);
        int deleteKey= rkeyList.iterator().next();
        rkeyList.remove(deleteKey);
        if (rkeyList.isEmpty()){
            freqToKeys.remove(this.minFreq);
            //minFreq需要更新吗?
        }
        keyToVal.remove(deleteKey);
        keyToFreq.remove(deleteKey);
    }
}
