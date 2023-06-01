package week6.HwangInyoung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        Queue<Character> queueL = new LinkedList<>();
        Queue<Character> queueS = new LinkedList<>();
        String str = br.readLine();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'L') {
                queueL.add(ch);
            } else if (ch == 'S'){
                queueS.add(ch);
            } else if (ch == 'R') {
                if (queueL.isEmpty()) {
                    break;
                } else {
                    count++;
                    queueL.poll();
                }
            } else if (ch == 'K') {
                if (queueS.isEmpty()) {
                    break;
                } else {
                    count++;
                    queueS.poll();
                }
            } else {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
