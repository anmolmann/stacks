
public class Implement2Stacks {
	int top1;
	int top2;
	int capacity;
	int []s;
	
	public Implement2Stacks(int capacity) {
		// TODO Auto-generated constructor stub
		this.top1 = -1;
		this.top2 = capacity;
		this.capacity = capacity;
		s = new int[capacity];
	}
	
	boolean overflow() {
		return this.top2- this.top1 <= 1;
	}
	
	boolean isEmpty1() {
		return this.top1 == -1;
	}
	
	boolean isEmpty2() {
		return this.top2 == capacity;
	}
	
	void push1(int x) {
		if(this.overflow()) return;
		this.s[++this.top1] = x; 
	}
	
	void push2(int x) {
		if(this.overflow()) return;
		this.s[--this.top2] = x;
	}
	
	int pop1() {
		if(this.isEmpty1()) return -1;
		return this.s[this.top1--];
	}
	
	int pop2() {
		if(this.isEmpty2()) return -1;
		return this.s[this.top2++];
	}
	
	int peek1() {
		if(this.isEmpty1()) return -1;
		return this.s[this.top1];
	}
	
	int peek2() {
		if(this.isEmpty2()) return -1;
		return this.s[this.top2];
	}
	
	public static void main(String args[]) {
		
		Implement2Stacks stack = new Implement2Stacks(5);
		stack.push1(3);
		stack.push2(9);
		stack.push1(11);
		stack.push1(20);
		stack.push2(30);
		System.out.println("Element popped : " + stack.pop1() + ", " + stack.pop2() +" -> " + stack.pop2());
		System.out.println("Element at the tp of the stack : " + stack.peek1() + ", " +stack.peek2());
	}
}
