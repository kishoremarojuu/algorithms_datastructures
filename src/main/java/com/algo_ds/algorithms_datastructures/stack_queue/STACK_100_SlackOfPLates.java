package com.algo_ds.algorithms_datastructures.stack_queue;

import java.util.LinkedList;
import java.util.Stack;

public class STACK_100_SlackOfPLates{
        private static final int STACK_SIZE = 3;
        private LinkedList<Stack<Integer>> stacks = new LinkedList<Stack<Integer>>();

        public void push(int item) {
            if (stacks.isEmpty() || stacks.getLast().size() >= STACK_SIZE) {
                Stack<Integer> stack = new Stack<Integer>();
                stack.push(item);
                stacks.add(stack);
            } else {
                stacks.getLast().push(item);
            }
        }

        public Integer pop() {
            if (stacks.isEmpty())
                throw new IllegalStateException("Stacks are empty!");
            Stack<Integer> last = stacks.getLast();
            int item = last.pop();
            if (last.isEmpty())
                stacks.removeLast();
            return item;
        }

        public Integer popAt(int index) {
            if (stacks.isEmpty())
                throw new IllegalStateException("Stacks are empty!");
            if (index < 0 || index >= stacks.size())
                throw new IllegalArgumentException("Invalid index!");
            int item = stacks.get(index).pop();
            for (int i = index; i < stacks.size() - 1; ++i) {
                Stack<Integer> curr = stacks.get(i);
                Stack<Integer> next = stacks.get(i + 1);
                curr.push(next.remove(0));
            }
            if (stacks.getLast().isEmpty())
                stacks.removeLast();
            return item;
        }

        public void printStacks() {
            for (Stack<Integer> stack : stacks) {
                for (int item : stack)
                    System.out.println(item + " ");

            }
        }


        public static void main(String[] args) {
            STACK_100_SlackOfPLates setOfStacks = new STACK_100_SlackOfPLates();
            setOfStacks.push(1); setOfStacks.push(2); setOfStacks.push(3);
            setOfStacks.push(4); setOfStacks.push(5); setOfStacks.push(6);
            setOfStacks.push(7); setOfStacks.push(8); setOfStacks.push(9);
            setOfStacks.printStacks();
            System.out.println();
            setOfStacks.popAt(1);
           // setOfStacks.popAt(0);
           // setOfStacks.popAt(2);
            setOfStacks.printStacks();
        }
}