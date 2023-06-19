package week8.eomchaewon.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	/*
	 * n번째 계단으로 가는 경우는
	 * 1. n-1에서 1칸 점프
	 * 2. n-2에서 2칸 점프
	 * -----------------------------
	 * 1의 경우에는 반드시 n-1에 도달하기 직전 행동은 n-3에서 2칸 점프여야 한다
	 * 1칸 점프를 연속 2번하면 안되기 때문!
	 * -----------------------------
	 * 따라서 n번째 계단 직전까지의 누적 점수는 두 경우 중 큰 값을 가진다
	 * 1. 누적점수[n-3] + 계단점수[n-1]
	 * 2. 누적점수[n-2]
	 **/

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		if(N==1){
			System.out.println(br.readLine());
			return;
		}

		int[] stair = new int[N + 1];
		int[] score = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}

		// find
		score[1] = stair[1];
		score[2] = stair[1] + stair[2];
		for (int i = 3; i <= N; i++) {
			score[i] = Math.max(score[i - 3] + stair[i - 1], score[i - 2]) + stair[i];
		}

		System.out.println(score[N]);
	}
}
