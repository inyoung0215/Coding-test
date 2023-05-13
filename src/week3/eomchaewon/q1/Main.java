package week3.eomchaewon.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer,Integer> cards= new HashMap<>();

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			int key = Integer.parseInt(st.nextToken());
			cards.put(key, cards.getOrDefault(key, 0) + 1);
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			sb.append(cards.getOrDefault(key, 0)).append(' ');
		}

		System.out.println(sb);
	}
}