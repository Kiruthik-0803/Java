import java.util.Stack;

public class StackReversal {
    public static void reverseStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Original Stack: " + stack);
        
        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}