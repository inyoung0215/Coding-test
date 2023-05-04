package week2.leejaewon.q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] nArr = Arrays.stream(bf.readLine().split(" "))
				.mapToInt(Integer::parseInt).sorted().toArray();
		int x = Integer.parseInt(bf.readLine());

		int answer = 0;
		int lt = 0;
		int rt = nArr.length - 1;
		while (lt < rt) {
			if (nArr[lt] + nArr[rt] < x) {
				lt++;
			} else if (nArr[lt] + nArr[rt] > x) {
				rt--;
			} else {
				answer++;
				lt++;
				rt--;
			}
		}
		System.out.println(answer);
	}
}
