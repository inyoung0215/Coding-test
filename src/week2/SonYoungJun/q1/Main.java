package week2.SonYoungJun.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> Dq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        while(N-- > 0) {
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "push_front":
                    Dq.addFirst(Integer.parseInt(str[1]));
                    break;
                case "push_back":
                    Dq.addLast(Integer.parseInt(str[1]));
                    break;
                case "pop_front":
                    sb.append(Dq.isEmpty() ? -1 : Dq.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(Dq.isEmpty() ? -1 : Dq.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(Dq.size()).append("\n");
                    break;
                case "empty":
                    sb.append(Dq.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(Dq.isEmpty() ? -1 : Dq.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(Dq.isEmpty() ? -1 : Dq.peekLast()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}