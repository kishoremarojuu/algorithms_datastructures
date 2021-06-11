package com.algo_ds.algorithms_datastructures.stack_queue;

import java.util.Stack;

class STACK_102_SortTheElementsIntheStack
{
    // This function return the sorted stack
    public static Stack<Integer> sortstack(Stack<Integer>
                                                   input)
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
            // pop out the first element
            int tmp = input.pop();

            // while temporary stack is not empty and
            // top of stack is greater than temp
            while(!tmpStack.isEmpty() && tmpStack.peek()
                    > tmp)
            {
                // pop from temporary stack and
                // push it to the input stack
                input.push(tmpStack.pop());
            }

            // push temp in tempory of stack
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    // Driver Code
    public static void main(String args[])
    {
        Stack<Integer> inputStack = new Stack<Integer>();


        inputStack.add(34);
        inputStack.add(3);
        inputStack.add(31);
        inputStack.add(98);
        inputStack.add(92);
        inputStack.add(23);

        // This is the temporary stack
        Stack<Integer> tmpStack=sortstack(inputStack);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty())
        {
            System.out.print(tmpStack.pop()+" ");
        }
    }
}
// This code is contributed by Danish Kaleem
