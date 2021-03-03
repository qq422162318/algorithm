package 算法题;

import java.util.*;

/**
 * 341. 扁平化嵌套列表迭代器
 * 给你一个嵌套的整型列表。请你设计一个迭代器，使其能够遍历这个整型列表中的所有整数。
 * 列表中的每一项或者为一个整数，或者是另一个列表。其中列表的元素也可能是整数或是其他列表。
 * 示例 1:
 * 输入: [[1,1],2,[1,1]]
 * 输出: [1,1,2,1,1]
 * 解释: 通过重复调用 next 直到 hasNext 返回 false，next 返回的元素的顺序应该是: [1,1,2,1,1]。
 * 示例 2:
 * 输入: [1,[4,[6]]]
 * 输出: [1,4,6]
 * 解释: 通过重复调用 next 直到 hasNext 返回 false，next 返回的元素的顺序应该是: [1,4,6]。
 */
public class likou341 {
    public static void main(String[] args) {
       NestedInteger[] list=new NestedInteger[3];
        List<NestedInteger> li=new ArrayList<>();
        li.add(new NestedInteger(1));li.add(new NestedInteger(1));
       list[0]=new NestedInteger(li);
       list[1]=new NestedInteger(2);
        List<NestedInteger> lis=new ArrayList<>();
        lis.add(new NestedInteger(1));lis.add(new NestedInteger(1));
       list[2]=new NestedInteger(lis);

    }
    public class NestedIterator implements Iterator<Integer> {
        private LinkedList<NestedInteger> list;

        public NestedIterator(List<NestedInteger> nestedList) {
            // 不直接用 nestedList 的引用，是因为不能确定它的底层实现
            // 必须保证是 LinkedList，否则下面的 addFirst 会很低效
            list = new LinkedList<>(nestedList);
        }

        public Integer next() {
            // hasNext 方法保证了第一个元素一定是整数类型
            return list.remove(0).getInteger();
        }

        public boolean hasNext() {
            // 循环拆分列表元素，直到列表第一个元素是整数类型
            while (!list.isEmpty() && !list.get(0).isInteger()) {
                // 当列表开头第一个元素是列表类型时，进入循环
                List<NestedInteger> first = list.remove(0).getList();
                // 将第一个列表打平并按顺序添加到开头
                for (int i = first.size() - 1; i >= 0; i--) {
                    list.addFirst(first.get(i));
                }
            }
            return !list.isEmpty();
        }
    }
    public static class NestedInteger {
        private Integer val;
        private List<NestedInteger> list;

        public NestedInteger(Integer val) {
            this.val = val;
            this.list = null;
        }
        public NestedInteger(List<NestedInteger> list) {
            this.list = list;
            this.val = null;
        }

        // 如果其中存的是一个整数，则返回 true，否则返回 false
        public boolean isInteger() {
            return val != null;
        }

        // 如果其中存的是一个整数，则返回这个整数，否则返回 null
        public Integer getInteger() {
            return this.val;
        }

        // 如果其中存的是一个列表，则返回这个列表，否则返回 null
        public List<NestedInteger> getList() {
            return this.list;
        }
    }
}
