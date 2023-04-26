package week1.leejaewon.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		for (int i = 0; i < T; i++) {
			System.out.println(isVPS(bf.readLine()));
		}
	}

	public static String isVPS(String s) {
		Stack<Character> stack = new Stack<>();
		int sLength = s.length();
		for (int i = 0; i < sLength; i++) {
			if ('(' == s.charAt(i)) {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		return stack.isEmpty() ? "YES" : "NO";
	}
}
