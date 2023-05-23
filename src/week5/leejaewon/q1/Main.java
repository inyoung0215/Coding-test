package week5.leejaewon.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());

		int answer = 1;
		int lt = 1;
		int rt = 1;
		int sum = 1;

		while (lt != N) {
			if (sum == N) {
				answer++;
				rt++;
				sum += rt;
			} else if (sum > N) {
				sum -= lt;
				lt++;
			} else {
				rt++;
				sum += rt;
			}
		}

		System.out.println(answer);
	}
}
