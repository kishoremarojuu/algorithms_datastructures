package com.algo_ds.algorithms_datastructures.stack_queue;

/* Java program to implement basic stack 
operations */
class STACK_103_StackImpl {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    STACK_103_StackImpl() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;    //insert the element into a[top] first and then increment top,
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;    ///return a[top--]
        }
    }


    public static void main(String[] args) {
        STACK_103_StackImpl s = new STACK_103_StackImpl();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");

        System.out.println(s.peek());
    }
}
