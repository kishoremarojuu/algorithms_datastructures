
package com.algo_ds.algorithms_datastructures.stack_queue;

import java.util.Stack;

public class Queue_101_QueueViAStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    Queue_101_QueueViAStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    private static void push(Stack<Integer> top_ref, int new_data) {
        top_ref.push(new_data);

    }

    private static void enquue(Queue_101_QueueViAStacks q, int x) {
        push(q.stack1, x);

    }

    private static int deQueue(Queue_101_QueueViAStacks q) {
        int x;
        if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
            System.out.println("Stacks are empty");
            System.exit(1);

        }

        if (q.stack2.isEmpty()) {
            while (!q.stack1.isEmpty()) {
                x = pop(q.stack1);
                push(q.stack2, x);
            }
        }
        x = pop(q.stack2);
        return x;
    }

    private static int pop(Stack<Integer> top_ref) {
        /*If stack is empty then error */
        if (top_ref.isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(0);
        }

        // pop the data from the stack
        return top_ref.pop();
    }


    public static void main(String[] args) {

        Queue_101_QueueViAStacks q = new Queue_101_QueueViAStacks();

        enquue(q, 1);
        enquue(q, 2);
        enquue(q, 3);


        System.out.println(deQueue(q) + " ");


    }


}
