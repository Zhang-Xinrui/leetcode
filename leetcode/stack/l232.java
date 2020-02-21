import java.util.Stack;
class MyQueue {
    Stack<Integer> stack, anotherstack;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
        anotherstack = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return anotherstack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(anotherstack.isEmpty()) {
            while(!stack.isEmpty()) {
                anotherstack.push(stack.pop());
            }
        }
        return anotherstack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty() && anotherstack.isEmpty();
    }
}
