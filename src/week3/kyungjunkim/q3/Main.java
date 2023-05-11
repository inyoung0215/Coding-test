package week3.kyungjunkim.q3;

import java.io.*;
import java.util.StringTokenizer;


public class Main {
    static int N;
    static int M;
    static boolean[][] graph;
    static boolean[] visit;
    static int count;
    static void dfs(int v){
        count++;
        visit[v] = true;
        for(int i=1;i<=N;i++){
            if((!visit[i])&&(graph[v][i])){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        graph = new boolean[N+1][ N+1];
        visit = new boolean[N+1];
        for(int i=0; i<M;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            graph[a1][a2] = true;
            graph[a2][a1] = true;
        }
        count =0;
        dfs(1);
        System.out.println(count-1);
    }

}
