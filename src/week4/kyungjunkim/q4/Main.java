package week4.kyungjunkim.q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int [] visited;
    static ArrayList<ArrayList<Integer>> graph;
    static int N,M,start;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new int[N + 1];
        for (int i = 0; i < M; i++) {
            StringTokenizer s2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(s2.nextToken());
            int b = Integer.parseInt(s2.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i=0;i<graph.size();i++){    // 오름차순 방문
            Collections.sort(graph.get(i));
        }

        bfs(start);

        for(int i = 1; i<=N; i++) {
            System.out.println(visited[i]);
        }
    }

    public static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        int count = 1;

        q.offer(start);
        visited[start] = count++;

        while(!q.isEmpty()){
            int a = q.poll();

            for(int i = 0; i<graph.get(a).size(); i++){
                int nextV = graph.get(a).get(i);

                if(visited[nextV] != 0)
                    continue;

                q.offer(nextV);
                visited[nextV] = count++;
            }
        }
    }
}
