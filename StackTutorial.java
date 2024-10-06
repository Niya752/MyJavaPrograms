/*This program implements stack and its basic operations
 * Written by Niya Justine
 * CSE B
 * Roll no 61 */
package cseb23rollno61;
//declaring a class Stack
class Stack {
	int[] element;
	int top;
	int maxSize;
	
	// constructor of class Stack	
	Stack(int size) {
		maxSize = size;
		element = new int[maxSize];
		top = -1;
	}
	
	// method to insert element into a stack
	void push(int item) {
		if (top == maxSize-1) {
			System.out.println("Stack overflow!");
		} else {
			top++;
			element[top] = item;
		}
	}
	
	// method to delete an element fro the stack
	void pop() {
		if (top == -1) {
			System.out.println("The stack is underflow");
		} else { 
			int poppedItem = element[top];
			top--;
			System.out.println("The deleted element is "+ poppedItem);			
		}
	}
	
	// method to print the size of stack
	void size() {
		System.out.println("The size of the stack is "+(top+1));
	}
	
	// method to display the stack
	void display() {
		System.out.println("The stack is :");
		for (int i=0; i<=top; i++) {
			System.out.print(element[i]+"  ");
		}
		System.out.print("\n");
	}
	
}

public class StackTutorial {

	public static void main(String[] args) {
		// creating object of the class stack
		Stack ob = new Stack(5);
		
		ob.push(10);
		ob.push(20);
        ob.push(30);
        ob.push(40);
        ob.push(50);
        ob.display();
        ob.size();
        ob.pop();
	}

}
