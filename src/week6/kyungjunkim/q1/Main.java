package week6.kyungjunkim.q1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = N;

        for (int i = 0; i < N; i++) {
            boolean[] check = new boolean[26];
            String s = br.readLine();
            check[s.charAt(0) - 'a'] = true;

            for (int j = 1; j < s.length(); j++) {

                if (s.charAt(j) != s.charAt(j - 1)) {
                    if (check[s.charAt(j) - 'a']) {
                        count--;
                        break;
                    } else {
                        check[s.charAt(j) - 'a'] = true;
                    }
                }

            }
        }
        System.out.println(count);
    }
}

