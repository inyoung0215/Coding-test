package week8.eomchaewon.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	/*규칙
	 * N 번째 2진 수열 만드는 방법(중복 없이,N=3 부터)
	 * 1. N-1 번째 2진 수열의 앞에 1 타일을 추가한다
	 * 2. N-2 번째 2진 수열의 앞에 00 타일을 추가한다
	 * ----------------------------------------------
	 * ex)
	 * N=1 [1]
	 * N=2 [00, 11]
	 * N=3일 때
	 * 1. N-1 번째 2진 수열의 앞에 1 타일을 추가한다 -> [100, 111]
	 * 2. N-2 번째 2진 수열의 앞에 00 타일을 추가한다 -> [001]
	 * 따라서 [001, 100, 111]
	 * ----------------------------------------------
	 * 결과만 보면
	 * 길이가 N인 모든 2진 수열의 개수 = N-1 개수 + N-2 개수
	 * */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		if (N == 1) {
			System.out.println(1);
			return;
		}

		long[] dp = new long[N + 1];
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= N; i++) {
			dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
		}

		System.out.println(dp[N]);
	}
}
