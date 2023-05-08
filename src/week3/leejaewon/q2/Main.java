package week3.leejaewon.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] firstInput = bf.readLine().split(" ");
		int N = Integer.parseInt(firstInput[0]);
		int M = Integer.parseInt(firstInput[1]);

		Set<String> nSet = new HashSet<>();
		for (int i = 0; i < N; i++) {
			nSet.add(bf.readLine());
		}

		int answer = 0;
		String[] mArr = new String[M];
		for (int i = 0; i < mArr.length; i++) {
			mArr[i] = bf.readLine();
		}

		for (String s : mArr) {
			if (nSet.contains(s)) {
				answer++;
			}
		}

		System.out.println(answer);
	}
}
