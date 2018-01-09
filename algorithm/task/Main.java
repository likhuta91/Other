package algorithm.task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		
		System.out.println(stack);
		System.out.println(queue);
		System.out.println("--------------");
		
		queue.add(stack.pop());
		System.out.println(stack);
		System.out.println(queue);
		System.out.println("--------------");
		stack.push("Dingleberry");
		stack.push("Eggplant");
		queue.add("Fig");
		System.out.println(stack);
		System.out.println(queue);
		System.out.println("--------------");
		stack.push(queue.remove());
		System.out.println(stack);
		System.out.println(queue);
		System.out.println("--------------");
		queue.add(stack.pop());
		System.out.println(stack);
		System.out.println(queue);
		System.out.println("--------------");
		queue.add(stack.pop());
		
		System.out.println(stack);
		System.out.println(queue);
	}
}
