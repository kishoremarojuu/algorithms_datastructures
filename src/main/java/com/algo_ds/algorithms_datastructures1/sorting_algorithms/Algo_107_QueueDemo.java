package com.algo_ds.algorithms_datastructures1.sorting_algorithms;

public class Algo_107_QueueDemo {

        private int arr[]; // array to store queue elements
        private int front; // front points to front element in the queue
        private int rear; // rear points to last element in the queue
        private int capacity; // maximum capacity of the queue
        //private int count; // current size of the queue

        // Constructor to initialize queue
        Algo_107_QueueDemo(int size) {
            arr = new int[size];

            System.out.println("printing size:"+size);
            capacity = size;
            front = 0;
            rear = 0;
            //count = 0;
        }

        // Utility function to add an item to the queue
        public void enqueue(int item) {
            // check for queue overflow
		/*if (count == capacity) {
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}*/

            if (capacity == rear) {
                System.out.println("Queue is full");
                System.exit(1);
            }



            System.out.println("Inserting " + item);

            arr[rear] = item;
            // rear = (rear + 1) % capacity;
            rear = (rear + 1);
            //count++;
        }

        /*	// Utility function to remove front element from the queue
            public void dequeue() {
                // check for queue underflow
                if (count == 0) {
                    System.out.println("UnderFlow\nProgram Terminated");
                    System.exit(1);
                }

                System.out.println("Removing " + arr[front]);

                // front = (front + 1) % capacity;
                front = (front + 1);
                count--;
            }
        */
        // Utility function to remove front element from the queue
        public void dequeue() {
            // check for queue underflow
            if (front == rear) {
                System.out.println("Queue is empty");
                System.exit(1);
            }

            System.out.println("Removing " + arr[front]);

            for(int i=0;i<rear-1;i++) {
                arr[i] = arr[i+1];
            }
        }

        // Utility function to return front element in the queue
        public int peek() {
		/*if (count == 0) {
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		return arr[front];*/


            if (front== rear) {
                System.out.println("queue is empty");
                System.exit(1);
            }

            else {
                System.out.println("Printing elements");
                for(int i=front;i<rear;i++) {
                    return arr[front];
                }
            }

            return arr[front];



        }

        /*
         * // Utility function to return the size of the queue public int size() {
         * return count; }
         */
        /*
         * // Utility function to check if the queue is empty or not public Boolean
         * isEmpty() { return (size() == 0); }
         *
         * // Utility function to check if the queue is empty or not public Boolean
         * isFull() { return (size() == capacity); }
         */

        // Queue implementation in java
        public static void main(String[] args) {
            // create a queue of capacity 5
            Algo_107_QueueDemo q = new Algo_107_QueueDemo(5);

            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            q.enqueue(5);

            //When you try to insert this element, it will give queuq is full
            //q.enqueue(6);



            System.out.println("Front element is: " + q.peek());
            q.dequeue();
            System.out.println("Front element is: " + q.peek());

            System.out.println("Queue size is " + q.capacity);

            q.dequeue();
            q.dequeue();

            if (q.capacity== 0)
                System.out.println("Queue Is Empty");
            else
                System.out.println("Queue Is Not Empty");
        }
    }


