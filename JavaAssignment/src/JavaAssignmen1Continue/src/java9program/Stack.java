package java9program;

public class Stack {

	int size;
	int arr[];
	int top;
 
	Stack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
 
	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}
 
	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];
 
		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}
 
	public int peek() {
		if(!this.isEmpty())
                        return arr[top];
                else
                {
                        System.out.println("Stack is Empty");
                        return -1;
                }
	}
 
	public boolean isEmpty() {
		return (top == -1);
	}
 
	public boolean isFull() {
		return (size - 1 == top);
	}
 
	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.pop();
		System.out.println("=================");
		s.push(10);
		s.push(30);
		s.push(50);
		s.push(40);
		System.out.println("=================");
		s.pop();
		s.pop();
		s.pop();
		System.out.println("=================");
	}
}
