// get minimum element from the stack

import java.util.*;
public class MinElem {
	Stack<Integer> s;
	int min;
	MinElem() {
		s = new Stack<Integer>();
		min = Integer.MAX_VALUE;
	}
	
	void push(int x) {
		if(s.isEmpty()) {
			s.push(x);
			min = x;
		}
		else if(x >= min) s.push(x);
		else {
			s.push(2 * x - min);
			min = x;
		}
	}
	
	int pop() {
		if(s.isEmpty()) return -1;
		int temp = s.pop();
		if(temp >= min) return temp;
		int stackElem = min;
		min = 2 * min - temp;
		return stackElem;
	}
	
	int minElement() {
		if(s.isEmpty()) return -1;
		return min;
	}
	
	public static void main(String args[]) {
		MinElem m = new MinElem();
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int choice = sc.nextInt();
			switch(choice) {
			case 1:	int x = sc.nextInt();
					m.push(x);
					break;
			case 2: System.out.println(m.pop());
					break;
			case 3: System.out.println(m.minElement());
					break;
			}
		}
		sc.close();
	}
}
