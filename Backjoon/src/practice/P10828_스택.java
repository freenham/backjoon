package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P10828_스택 {
	private int[] stack;
	private int index;

	public P10828_스택(int size) {
		stack = new int[size];
	}

	public void push(int x) {
		stack[index++] = x;
	}

	public int pop() {
		if (index <= 0) {
			System.out.println("-1");
			return -1;
		} else {
			System.out.println(stack[--index]);
			return stack[index];
		}
	}

	public int size() {
		System.out.println(index);
		return index;
	}

	public int empty() {
		if (index == 0) {
			System.out.println("1");
			return 1;
		} else {
			System.out.println("0");
			return 0;
		}
	}

	public int top() {
		if (index == 0) {
			System.out.println("-1");
			return -1;
		} else {
			System.out.println(stack[index - 1]);
			return stack[index - 1];
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner s = new Scanner(System.in);
		Scanner s = new Scanner(new FileInputStream("sample.txt"));
		int n = s.nextInt();
		int cnt = 0;
		P10828_스택 stack = new P10828_스택(n);
		while (cnt < n) {
			String command = s.next();
			if (command.equals("push")) {
				int x = s.nextInt();
				stack.push(x);
			}
			if (command.equals("pop")) {
				stack.pop();
			}
			if (command.equals("top")) {
				stack.top();
			}
			if (command.equals("size")) {
				stack.size();
			}
			if (command.equals("empty")) {
				stack.empty();
			}
			cnt++;
		}

	}

}
