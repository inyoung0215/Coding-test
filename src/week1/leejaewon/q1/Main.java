package week1.leejaewon.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int result = 0;

		while (st.hasMoreTokens()) {
			st.nextToken();
			result++;
		}

		System.out.println(result);
	}
}
