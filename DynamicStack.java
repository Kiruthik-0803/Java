import java.util.Arrays;

public class DynamicStack {
    private int[] stack;
    private int top;
    private int capacity;

    public DynamicStack() {
        capacity = 2;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int item) {
        if (top == capacity - 1) {
            capacity *= 2;
            stack = Arrays.copyOf(stack, capacity);
        }
        stack[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        return stack[top--];
    }

    public static void main(String[] args) {
        DynamicStack dynamicStack = new DynamicStack();
        dynamicStack.push(5);
        dynamicStack.push(10);
        System.out.println(dynamicStack.pop());
    }
}