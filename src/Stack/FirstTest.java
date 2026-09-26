package Stack;

import java.util.Stack;

public class FirstTest {
    public static void main(String[] args) {
//        push(10)
//        push(20)
//        push(30)
//        pop()
//        push(40)
//        peek()
//        pop()


        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("size of stack is " + stack.size());
        System.out.println("Printing the stack " + stack);
        stack.pop();
        System.out.println("Printing stack after removing last value  " + stack);
        stack.push(40);
        System.out.println("Printing stack after adding 40 to top  " + stack);
        System.out.println("Printing stack with peek operation  " + stack.peek());
    }
}
