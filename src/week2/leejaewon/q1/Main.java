package week2.leejaewon.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new LinkedList<>();
		int N = Integer.parseInt(bf.readLine());

		for (int i = 0; i < N; i++) {
			runDequeCommand(bf.readLine(), deque);
		}

	}

	public static void runDequeCommand(String command, Deque<Integer> deque) {
		String[] dequeCommand = command.split(" ");
		switch (dequeCommand[0]) {
			case "push_front":
				deque.offerFirst(Integer.parseInt(dequeCommand[1]));
				break;
			case "push_back":
				deque.offerLast(Integer.parseInt(dequeCommand[1]));
				break;
			case "pop_front":
				System.out.println(deque.peekFirst() == null ? -1 : deque.pollFirst());
				break;
			case "pop_back":
				System.out.println(deque.peekLast() == null ? -1 : deque.pollLast());
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				System.out.println(deque.isEmpty() ? 1 : 0);
				break;
			case "front":
				System.out.println(deque.peekFirst() == null ? -1 : deque.peekFirst());
				break;
			case "back":
				System.out.println(deque.peekLast() == null ? -1 : deque.peekLast());
				break;
		}
	}
}
