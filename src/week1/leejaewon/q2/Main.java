package week1.leejaewon.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		String input = bf.readLine();

		for (int i = 0; i < input.length(); i++) {
			result += getAlphaNum(input.charAt(i));
		}

		System.out.println(result);
	}

	public static int getAlphaNum(char ch) {
		if (ch <= 90 && ch > 86) {
			return 10;
		} else if (ch > 83) {
			return 9;
		} else if (ch > 79) {
			return 8;
		} else if (ch > 76) {
			return 7;
		} else if (ch > 73) {
			return 6;
		} else if (ch > 70) {
			return 5;
		} else if (ch > 67) {
			return 4;
		} else {
			return 3;
		}
	}
}
