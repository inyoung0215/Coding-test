package week6.leejaewon.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(bf.readLine());

		int answer = 0;
		for (int i = 0; i < N; i++) {
			boolean check[] = new boolean[26];
			String s = bf.readLine();
			boolean isGroupWord = true;

			for (int j = 0; j < s.length(); j++) {
				int index = s.charAt(j) - 'a';
				if (check[index]) {
					if (s.charAt(j) != s.charAt(j - 1)) {
						isGroupWord = false;
						break;
					}
				} else {
					check[index] = true;
				}
			}
			if (isGroupWord) {
				answer++;

			}
		}
		System.out.println(answer);
	}
}


