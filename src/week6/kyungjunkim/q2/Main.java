package week6.kyungjunkim.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int[] array = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'A';
            array[index]++;
        }

        int oddNum = 0;
        int lastOddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNum++;
                lastOddIndex = i;
            }
            if (oddNum >= 2) {
                System.out.println("I'm Sorry Hansoo");
                return;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i] / 2; j++) {
                sb.append((char)(i+'A'));
            }
        }

        String result = sb.toString();

        if (oddNum == 1) {
            result += (char) (lastOddIndex + 'A');
        }

        result += sb.reverse().toString();
        System.out.println(result);

    }
}
