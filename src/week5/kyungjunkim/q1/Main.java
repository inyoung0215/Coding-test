package week5.kyungjunkim.q1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 1;

        while (start <= N) {
            if (sum < N) {
                sum += end;
                end++;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                count++;
                sum += end;
                end++;
            }
        }

        bw.write(Integer.toString(count));
        bw.flush();

        bw.close();
        br.close();
    }
}
