// LeetCode 232: Implement Queue using Stacks
// Approach: Use two stacks where inQ handles push operations and outQ handles pop and peek; transfer elements from inQ to outQ only when outQ is empty to maintain FIFO order efficiently
// Time Complexity: Amortized O(1) for push, pop, and peek
// Space Complexity: O(n)
// Learning: Using two stacks with lazy transfer simulates queue behavior while keeping operations efficient

// Solution
class MyQueue {
    Stack <Integer> inQ;
    Stack <Integer> outQ;

    public MyQueue() {
        inQ = new Stack<>();
        outQ = new Stack<>();
    }
    
    public void push(int x) {
        inQ.push(x);
    }
    
    public int pop() {
        peek();
        return outQ.pop();        
    }
    
    public int peek() {
        if(outQ.isEmpty()){
            while(!inQ.isEmpty()){
                outQ.push(inQ.pop());
            }
        }
        return outQ.peek();
    }
    
    public boolean empty() {
        return outQ.isEmpty() && inQ.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
