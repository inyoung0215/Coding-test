package week3.leejaewon.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		String[] cardArr = bf.readLine().split(" ");
		Map<String, Integer> cardMap = new HashMap<>();

		for (String s : cardArr) {
			cardMap.put(s, cardMap.getOrDefault(s, 0) + 1);
		}

		int M = Integer.parseInt(bf.readLine());
		String[] mArr = bf.readLine().split(" ");
		StringBuilder sb = new StringBuilder();

		for (String m : mArr) {
			if (cardMap.get(m) == null) {
				sb.append("0").append(" ");
				continue;
			}
			sb.append(cardMap.get(m)).append(" ");
		}

		System.out.println(sb);
	}
}
