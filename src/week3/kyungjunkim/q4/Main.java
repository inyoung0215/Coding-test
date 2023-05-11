package week3.kyungjunkim.q4;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] arr = new int[num];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int curSum = arr[0];
        int minLen = Integer.MIN_VALUE;

        while (start <= end && end < num) {
            if (curSum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                curSum -= arr[start++];
            } else {
                end++;
                if (end < num) curSum += arr[end];
            }
        }

        if (minLen == Integer.MIN_VALUE) {
            bw.write("0");
        } else {
            bw.write(String.valueOf(minLen));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
