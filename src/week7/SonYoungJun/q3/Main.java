package week7.SonYoungJun.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        System.out.println(BFS(N, K));
    }
    public static int BFS(int N, int K) {
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[100001];
        q.add(N);
        while(!q.isEmpty()) {
            int cur = q.poll();
            if(cur == K) break;
            for(int i=0; i<3; i++) {
                int next = cur;
                if(i == 0) next -= 1;
                else if(i == 1) next += 1;
                else next *= 2;

                if(next < 0 || next > 100000 || visited[next] > 0) continue;
                q.add(next);
                visited[next] = visited[cur] + 1;
            }
        }
        return visited[K];
    }
}
