// Next Greater Element

import java.util.*;
public class NGE {
	Stack<Integer> s;
	
	public void nextGreaterElement(int[] a) {
		s = new Stack<Integer>();
		s.push(a[0]);
		
		Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
		
		for(int i = 1; i < a.length; i++) {
			if(!s.isEmpty() && s.peek() >= a[i]) s.push(a[i]);
			else {
				while(!s.isEmpty() && s.peek() < a[i]) {
					System.out.println(s.peek() + " : " + a[i]);
					m.put(s.pop(), a[i]);
				}
				s.push(a[i]);
			}
		}
		while(!s.isEmpty()) {
			m.put(s.peek(), -1);
			System.out.println(s.pop() + " : -1");
		}
		for(Map.Entry<Integer, Integer> e : m.entrySet()) 
			System.out.println(e.getKey() + " : " + e.getValue());
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(m.get(a[i]) + " ");
		}
	}
	
	public static void main(String args[]) {
		NGE nge = new NGE();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []m = new int[n];
		for(int i = 0; i < n; i++)
			m[i] = sc.nextInt();
		nge.nextGreaterElement(m);
		sc.close();
	}
}
/*
 *

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t = 0;
		if(sc.hasNextInt()) t = sc.nextInt();
		for(int i = 0; i < t; i++) {
		    int n = sc.nextInt();
		    int []a = new int[n];
		    for(int j = 0; j < n; j++)
		        a[j] = sc.nextInt();
		    Stack<Integer> s = new Stack<Integer>();
		    Stack<Integer> f = new Stack<Integer>();
		    f.push(-1);
		    s.push(a[n-1]);
		    for(int j = n - 2; j >= 0; j--) {
		        int temp_s;
		        if(!s.isEmpty() && (temp_s = s.pop()) > a[j]) {
		            f.push(temp_s);
		            s.push(temp_s);
		            s.push(a[j]);
		        }
		        else {
		            int temp = -1;
		            while(!s.isEmpty() && (temp = s.pop()) <= a[j]);
		            if(s.isEmpty() && temp < a[j]) f.push(-1);
		            else f.push(temp);
		            if(temp > a[j]) s.push(temp);
		            s.push(a[j]);
		        }
		    }
		    while(!f.isEmpty()) System.out.print(f.pop() + " ");
		    System.out.print("\n");
		}
		sc.close();
	}
}
 * 
*/


/*
 
import java.util.*;
import java.lang.*;
import java.io.*;



class GFG {
    
    public void nextGreaterElement(int[] a) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(a[0]);
		
		Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
		
		for(int i = 1; i < a.length; i++) {
			if(!s.isEmpty() && s.peek() >= a[i]) s.push(a[i]);
			else {
				while(!s.isEmpty() && s.peek() < a[i]) {
					m.put(s.pop(), a[i]);
				}
				s.push(a[i]);
			}
		}
		while(!s.isEmpty()) {
			m.put(s.pop(), -1);
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(m.get(a[i]) + " ");
		}
	}
    
	public static void main (String[] args) {
		//code
		
		GFG nge = new GFG();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if(sc.hasNext()) n = sc.nextInt();
		
		for(int j = 0; j < n; j++) {
		    
		    int t = 0;
		    if(sc.hasNext()) t = sc.nextInt();
		    int []m = new int[t];
		    for(int i = 0; i < t; i++) {
			    if(sc.hasNext()) m[i] = sc.nextInt();
	        }
	        nge.nextGreaterElement(m);
	        System.out.print("\n");
		}
		sc.close();
	}
}
 
 */

