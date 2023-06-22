package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3 {
    private static int[][] colorPaper;
    private static int blue = 0;
    private static int white = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        colorPaper = new int[n][n];
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++){
                colorPaper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divided(0,0,n);
        System.out.println(white);
        System.out.println(blue);
        br.close();
    }

    private static void divided(int x, int y, int size) {
        if (sameColor(x, y, size)) {
            if (colorPaper[x][y] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }
        int halfSize = size / 2;
        divided(x, y, halfSize);
        divided(x, y + halfSize, halfSize);
        divided(x + halfSize, y, halfSize);
        divided(x + halfSize, y + halfSize, halfSize);
    }

    private static boolean sameColor(int x, int y, int size) {
        int color = colorPaper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (colorPaper[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
