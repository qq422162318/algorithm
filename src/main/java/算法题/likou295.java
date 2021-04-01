package 算法题;

import java.util.PriorityQueue;

/**
 * 295. 数据流的中位数 中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。 例如， [2,3,4] 的中位数是 3 [2,3]
 * 的中位数是 (2 + 3) / 2 = 2.5 设计一个支持以下两种操作的数据结构： void addNum(int num) -
 * 从数据流中添加一个整数到数据结构中。 double findMedian() - 返回目前所有元素的中位数。 示例： addNum(1)
 * addNum(2) findMedian() -> 1.5 addNum(3) findMedian() -> 2 进阶: 如果数据流中所有整数都在 0
 * 到 100 范围内，你将如何优化你的算法？ 如果数据流中 99% 的整数都在 0 到 100 范围内，你将如何优化你的算法？
 */
public class likou295 {
    public static void main(String[] args) {
        likou295 likou = new likou295();
        likou.run();
    }

    public void run() {
        MedianFinder me = new MedianFinder();
        me.addNum(1);
        me.addNum(2);
        System.out.println(me.findMedian());

    }

    class MedianFinder {
        private PriorityQueue<Integer> large, small;

        /**
         * initialize your data structure here.
         */
        public MedianFinder() {
            //小顶堆
            large = new PriorityQueue<>();
            //大顶堆
            small = new PriorityQueue<>((a, b) -> {
                return b - a;
            });
        }

        /**
         * 简单说，想要往large里添加元素，不能直接添加，而是要先往small里添加，
         * 然后再把small的堆顶元素加到large中；
         * 向small中添加元素同理。
         * @param num 要添加的数
         */
        public void addNum(int num) {
            if (small.size() >= large.size()) {
                small.offer(num);
                large.offer(small.poll());
            } else {
                large.offer(num);
                small.offer(large.poll());
            }
        }

        public double findMedian() {
            // 如果元素不一样多，多的那个堆的堆顶元素就是中位数
            if (large.size() < small.size()) {
                return small.peek();
            } else if (large.size() > small.size()) {
                return large.peek();
            }
            // 如果元素一样多，两个堆堆顶元素的平均数是中位数
            return (large.peek() + small.peek()) / 2.0;
        }
    }
}