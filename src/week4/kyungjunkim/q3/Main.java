package week4.kyungjunkim.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int [] visited;
    static ArrayList<ArrayList<Integer>> graph;
    static int N,M,count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         N = Integer.parseInt(st.nextToken());   // 정점의 수
         M = Integer.parseInt(st.nextToken());   // 간선의 수
         count = Integer.parseInt(st.nextToken());   // 시작 정점

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

        visited[count] = 1;
        dfs(count);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N ; i++) {
            sb.append(visited[i]).append('\n');
        }
        System.out.println(sb);
    }

    public static void dfs(int v){
        visited[v] = count;

        for (int i = 0; i < graph.get(v).size(); i++) {
            int y = graph.get(v).get(i);

            if (visited[y] == 0){
                count++;
                dfs(y);
            }
        }
    }
}
