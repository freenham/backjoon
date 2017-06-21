package practice;

import java.util.Scanner;

public class P10828_스택{
	private int[] stack;
	private int index;

	public P10828_스택(int size) {
		stack = new int[size];
	}

	public void push(int x) {
//		System.out.println();
		stack[index++] = x;
	}

	public int pop() {
		if(index<=0) {
			System.out.println("-1");
			return -1;
		}
		System.out.println(stack[--index]);
		return stack[index];
	}

	public int size() {
		System.out.println(index);
		return index;
	}

	public int empty() {
		if (index == 0) {
			System.out.println("1");
			return 1;
		}
		else{
			System.out.println("0");
			return 0;
		}
	}

	public int top() {
		System.out.println(stack[index-1]);
		return stack[index-1];
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < stack.length; i++) {
			if (index >= 0)
				s = String.valueOf(pop() + " ") + s;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		P10828_스택 stack = new P10828_스택(n);
		while(true){
			String command = s.next();
			if(command.equals("exit"))
				break;
			if(command.equals("push")) {
				int x = s.nextInt();
				stack.push(x);
			}
			if(command.equals("pop")) {
				stack.pop();
			}
			if(command.equals("top")) {
				stack.top();
			}
			if(command.equals("size")) {
				stack.size();
			}
			if(command.equals("empty")) {
				stack.empty();
			}
		}
		

		

	}

}
