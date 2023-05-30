package week6.leejaewon.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int size = s.length();

		int[] alp = new int[26];
		for (int i = 0; i < size; i++)
			alp[s.charAt(i) - 'A']++;

		int cnt = 0;
		int center = 0;
		for (int i = 0; i < 26; i++)
			if (alp[i] % 2 != 0) {
				center = i;
				cnt++;
			}

		if (cnt > 1 || (cnt == 1 && size % 2 == 0)) {
			System.out.print("I'm Sorry Hansoo");
			return;
		}

		StringBuffer result = new StringBuffer();
		for (int i = 0; i < 26; i++)
			for (int j = 0; j < alp[i] / 2; j++)
				result.append((char)(i + 'A'));
		StringBuffer tmp = new StringBuffer(result.toString());
		if (cnt == 1)
			result.append((char)(center + 'A'));
		System.out.println(result.toString() + tmp.reverse());
	}
}
