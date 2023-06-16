package week7.HwangInyoung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int result = bfs(n, k);
        System.out.println(result);
        br.close();
    }

    private static int bfs(int n, int k){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        int time = 0;

        queue.offer(n);
        visited[n] = true;

        while (!queue.isEmpty()){

            int size = queue.size();
            for (int i = 0; i < size; i++){
                int curr = queue.poll();

                int next = curr + 1;
                int prev = curr - 1;
                int telp = curr * 2;
                if (curr == k){
                    return time;
                }

                if (prev >= 0 && !visited[prev]){
                    visited[prev] =true;
                    queue.add(prev);
                }

                if (next <= 100000 && !visited[next]){
                    visited[next] = true;
                    queue.add(next);
                }

                if (telp <= 100000 && !visited[telp]){
                    visited[telp] = true;
                    queue.add(telp);
                }
            }
            time++;
        }
        return time;
    }
}
