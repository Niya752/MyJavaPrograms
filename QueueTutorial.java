/*This program is to implement queue and its basic operations
 * Written by Niya Justine
 * CSE B
 * Roll no 61 */
package cseb23rollno61;
// creating a class Queue
class Queue1 {
    int[] queue;
    int front, rear, count;
    // default constructor
    Queue1() {
     
    }
   
    // parameterized constructor
    Queue1(int size) {
        queue = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    // method to insert elements into a queue
    void enqueue(int item) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = item;
            count++;
        }
    }

    // method to delete an element from the queue
    void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            int item = queue[front];
            front = (front + 1) % queue.length;
            count--;
            System.out.println("The deleted item is " + item);
        }
    }

    // method to display a queue
    void display() {
        System.out.println("The queue is:");
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % queue.length] + "  ");
        }
        System.out.print("\n");
    }

    boolean isEmpty() {
        return count == 0;
    }

    boolean isFull() {
        return count == queue.length;
    }
}

public class QueueTutorial {

    public static void main(String[] args) {
        // creating object of class Queue
        Queue1 ob = new Queue1(5);
        
        ob.enqueue(10);
        ob.enqueue(20);
        ob.enqueue(30);
        ob.enqueue(40);
        ob.enqueue(50);
        ob.display();
        ob.dequeue();
        ob.display();
    }
}
