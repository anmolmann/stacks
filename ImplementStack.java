// implement stack using arrays
public class ImplementStack {
	int top;
	int capacity;
	int []s;
	
	public ImplementStack(int capacity) {
		// TODO Auto-generated constructor stub
		this.top = -1;
		this.capacity = capacity;
		s = new int[capacity];
	}
	
	boolean isFull() {
		return this.top == this.capacity - 1;
	}
	
	boolean isEmpty() {
		return this.top == -1;
	}
	
	void push(int x) {
		if(this.isFull()) return;
		this.s[++this.top] = x; 
	}
	
	int pop() {
		if(this.isEmpty()) return -1;
		return this.s[this.top--];
	}
	
	int peek() {
		if(this.isEmpty()) return -1;
		return this.s[this.top];
	}
	
	public static void main(String args[]) {
		
		ImplementStack stack = new ImplementStack(5);
		stack.push(3);
		stack.push(9);
		stack.push(11);
		System.out.println("Element popped : " + stack.pop());
		System.out.println("Element at the tp of the stack : " + stack.peek());
	}
}
