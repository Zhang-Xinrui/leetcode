class MinStack {
    List<List<Integer>> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>(); //注意，这里要求保存最小值
    }
    
    public void push(int x) {
        List<Integer> newlist = new ArrayList<>();
        newlist.add(x);
        if(stack.size() == 0) newlist.add(x);
        else newlist.add(Math.min(x, stack.get(stack.size() - 1).get(1)));
        stack.add(newlist);
        return;
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1).get(0);
    }
    
    public int getMin() {
        return stack.get(stack.size() - 1).get(1);
    }
}