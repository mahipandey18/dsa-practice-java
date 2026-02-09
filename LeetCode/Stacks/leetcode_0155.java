// LeetCode 155: Min Stack
// Approach: Use a single stack to store the difference between the pushed value and the current minimum; maintain a variable min to track the current minimum, update it when a new smaller value is pushed, and restore the previous minimum during pop when a negative difference is encountered
// Time Complexity: O(1) for push, pop, top, and getMin
// Space Complexity: O(n)
// Learning: Encoding values as differences allows tracking and restoring minimum values in constant time using only one stack

// Solution
class MinStack {
    Stack <Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(0L);
            min = val;
        }
        else{
            st.push(val-min);
            if(val<min){
                min = val;
            }
        }
    }
    
    public void pop() {
        long top = st.pop();
        if(top<0){
            min = min - top;
        }
    }
    
    public int top() {
        long top = st.peek();
        if(top < 0){
            return (int)min;
        }
        else{
            return (int)(min+top);
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
