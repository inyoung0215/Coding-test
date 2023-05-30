package week6.HwangInyoung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] alpha = new int[26];
        for (char ch : str.toCharArray()){
            alpha[ch-'A']++;
        }

        StringBuilder sb = new StringBuilder();
        List<Character> oddChars = new ArrayList<>();

        for (int i = 0; i < alpha.length; i++){
            if (alpha[i] % 2 != 0){
                oddChars.add((char) (i + 'A'));
            }
        }

        if (oddChars.size() > 1){
            System.out.println("I'm Sorry Hansoo");
        } else {
            for (int i = 0; i < alpha.length; i++){
                char ch = (char) (i + 'A');
                int num = alpha[i] / 2;

                for (int j = 0; j < num; j++){
                    sb.append(ch);
                }
            }

            StringBuilder reverse = new StringBuilder(sb).reverse();
            for (char ch : oddChars){
                sb.append(ch);
            }
            sb.append(reverse);

            System.out.println(sb);
        }
    }
}
