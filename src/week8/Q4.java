package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(n-1 == 0 && m-1 == 0){
            System.out.print(1);
            System.exit(0);
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        char[][] miro = new char[n][m];
        int[][] dist = new int[n][m];
        boolean[][][] visit = new boolean[2][n][m];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            for (int j = 0; j < m; j++) {
                miro[i][j] = s.charAt(j);
            }
        }

        queue.offer(new int[]{0, 0, 0});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for(int i=0; i<4; i++){
                int nX = cur[0] + dx[i];
                int nY = cur[1] + dy[i];

                if (nX < 0 || nX >= n || nY < 0 || nY >= m) {
                    continue;
                }

                if (miro[nX][nY] == '1') {
                    if(cur[2] == 0 && !visit[1][nX][nY]){
                        visit[cur[2]][nX][nY] = true;
                        dist[nX][nY] = dist[cur[0]][cur[1]] + 1;
                        queue.offer(new int[]{nX, nY, 1});
                    }
                }
                else{
                    if(!visit[cur[2]][nX][nY]){
                        visit[cur[2]][nX][nY] = true;
                        dist[nX][nY] = dist[cur[0]][cur[1]] + 1;
                        queue.offer(new int[]{nX, nY, cur[2]});
                    }
                }

                if(nX == n-1 && nY == m-1){
                    System.out.print(dist[nX][nY] + 1);
                    System.exit(0);
                }
            }
        }
        System.out.print(-1);
    }
}