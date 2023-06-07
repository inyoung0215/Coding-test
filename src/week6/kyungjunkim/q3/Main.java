package week6.kyungjunkim.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int count = 0;
        int countL = 0;
        int countS = 0;

        for (int i = 0; i < n; i++) {
            char curr = str.charAt(i);
            if (Character.isDigit(curr)) {
                count++;
            } else if (curr == 'L') {
                countL++;
            } else if (curr == 'S') {
                countS++;
            } else if (curr == 'R') {
                if (countL > 0) {
                    count++;
                    countL--;
                } else {
                    break;
                }
            } else if (curr == 'K') {
                if (countS > 0) {
                    count++;
                    countS--;
                } else {
                    break;
                }
            }
        }

        System.out.println(count);
    }
}

