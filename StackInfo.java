package com.virtusa;

import java.util.Stack;

public class StackInfo {

	public static void main(String[] args) {

		Stack<Integer> unSortedStack = new Stack<Integer>();
		Stack<Integer> sortedStack   = new Stack<Integer>();
		
		unSortedStack.push(100);
		unSortedStack.push(1);
		unSortedStack.push(1);
		unSortedStack.push(100);
		unSortedStack.push(100);
		unSortedStack.push(99);
		unSortedStack.push(4);
		unSortedStack.push(5);
		unSortedStack.push(9);
		unSortedStack.push(11);
		unSortedStack.push(6);
		unSortedStack.push(3);
		unSortedStack.push(1);
		unSortedStack.push(2);


		System.out.println(unSortedStack);

		while (!unSortedStack.isEmpty()) {

			if (sortedStack.isEmpty()) {
				sortedStack.push(unSortedStack.pop());
			} else if (unSortedStack.peek() > sortedStack.peek()) {
				sortedStack.push(unSortedStack.pop());
			} else {
				int top = unSortedStack.pop();
				int count = 0;

				while ((!sortedStack.isEmpty())&&(top < sortedStack.peek())) {
						unSortedStack.push(sortedStack.pop());
						count++;	
				}
				sortedStack.push(top);
				for (int i = 0; i < count; i++) {
					sortedStack.push(unSortedStack.pop());
				}
			}
		}

		System.out.println(sortedStack);

	}
}
