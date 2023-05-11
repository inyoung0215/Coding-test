package week3.eomchaewon.q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int[] numbers = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int start = 0;
		int end = 0;
		int sum = 0;
		int count = N + 1;

		while (true) {
			// if문 순서 중요... 
			if (S <= sum) {
				sum -= numbers[start++];
				count = Math.min(count, (end - start) + 1);
			} else if (end == N) {
				break;
			} else {
				sum += numbers[end++];
			}
		}

		System.out.println((count == N + 1) ? 0 : count);
	}
}
