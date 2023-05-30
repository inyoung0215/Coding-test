package week6.HwangInyoung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++){
            String str = br.readLine();
            Set<Character> set = new HashSet<>();
            boolean isGroup = true;

            for (int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                if (set.contains(ch) && str.charAt(j-1) != ch){
                    isGroup = false;
                    break;
                } else {
                    set.add(ch);
                }
            }

            if (isGroup){
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
