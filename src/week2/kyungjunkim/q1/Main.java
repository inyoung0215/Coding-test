package week2.kyungjunkim.q1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        while (num-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String input = st.nextToken();

            if (input.equals("push_front")) {
                deque.offerFirst(Integer.parseInt(st.nextToken()));
            } else if (input.equals("push_back")) {
                deque.offerLast(Integer.parseInt(st.nextToken()));
            } else if (input.equals("pop_front")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.pollFirst() + "\n");
                }
            } else if (input.equals("pop_back")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.pollLast() + "\n");
                }
            } else if (input.equals("size")) {
                bw.write(deque.size() + "\n");
            } else if (input.equals("empty")) {
                if (deque.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (input.equals("front")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.peekFirst() + "\n");
                }
            } else if (input.equals("back")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.peekLast() + "\n");
                }
            }
        }

        br.close();
        bw.close();
    }
}

