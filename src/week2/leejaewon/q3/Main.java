package week2.leejaewon.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		LinkedList<Integer> list = new LinkedList<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<Integer> mList = Arrays.stream(bf.readLine().split(" "))
				.map(Integer::parseInt).toList();

		for (int i = 0; i < N; i++) {
			if (mList.contains(i + 1)) {
				list.add(i + 1);
				continue;
			}
			list.add(0);
		}

		int index = 0;
		int answer = 0;
		while (index < M) {
			int rightSide = list.indexOf(mList.get(index));
			int leftSide = list.size() - rightSide;

			if (rightSide == 0) {
				list.pollFirst();
			} else if (rightSide <= leftSide) {
				answer += rightSide;
				moveLeft(list, rightSide);
				list.pollFirst();
			} else {
				answer += leftSide;
				moveRight(list, leftSide);
				list.pollFirst();
			}
			index++;
		}
		System.out.println(answer);
	}

	public static void moveLeft(LinkedList<Integer> list, int count) {
		for (int i = 0; i < count; i++) {
			list.add(list.pollFirst());
		}
	}

	public static void moveRight(LinkedList<Integer> list, int count) {
		for (int i = 0; i < count; i++) {
			list.addFirst(list.pollLast());
		}
	}
}
