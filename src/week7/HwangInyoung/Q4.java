package week7.HwangInyoung;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q4 {
    private static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        int[][] box = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] isValid = br.readLine().split(" "); // 공백으로 구분하여 입력 받음
            for (int j = 0; j < m; j++) {
                int tomato = Integer.parseInt(isValid[j]); // 각각의 정수로 변환
                box[i][j] = tomato;
                if (tomato == 1) {
                    queue.add(new Point(i, j));
                }
            }
        }
        bfs(box, m, n);
    }

    private static void bfs(int[][] box, int m, int n) {
        int day = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int size = queue.size();

            // 현재 날짜에서 익은 토마토들을 순차적으로 처리
            for (int i = 0; i < size; i++) {
                Point tomato = queue.poll();
                int x = tomato.x;
                int y = tomato.y;

                // 상하좌우로 이동하며 익지 않은 토마토를 익게 만듦
                for (int[] dir : directions) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    // 범위 체크 및 익지 않은 토마토인 경우 처리
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0) {
                        box[nx][ny] = 1; // 익은 토마토로 변경
                        queue.offer(new Point(nx, ny)); // 다음 익은 토마토를 큐에 추가
                    }
                }
            }

            // 하루가 지남
            day++;
        }

        // 익지 않은 토마토가 남아있는지 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1); // 익지 않은 토마토가 남아있는 경우 -1 출력
                    return;
                }
            }
        }
        System.out.println(day - 1); // 최소 일수 출력 (첫 날은 0일이므로 1을 뺌)
    }
}
