package 算法题;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyStackAndMyQueue {
    class MyQueue {
        Stack<Integer> s1;
        Stack<Integer> s2;

        MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            peek();
            return s2.pop();
        }

        public int peek() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }

    class MyStack {
        Queue<Integer> q = new LinkedList<>();
        int top_ele = 0;

        public void push(int x) {
            q.offer(x);
            top_ele = x;
        }

        public int pop() {
            int size = q.size();
            while (size > 2) {
                q.offer(q.poll());
                size--;
            }
            top_ele=q.peek();
            q.offer(q.poll());
            return q.poll();
        }

        public int top() {
            return top_ele;
        }

        public boolean empty() {
            return q.isEmpty();
        }
    }
}
