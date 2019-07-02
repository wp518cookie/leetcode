package geekbang.tanchao.queue_and_stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wuping
 * @date 2019-05-14
 */

public class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        Queue<Integer> temp = new LinkedList<>();
        temp.add(x);
        while (!queue.isEmpty()) {
            temp.add(queue.poll());
        }
        queue = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.size() == 0;
    }
}