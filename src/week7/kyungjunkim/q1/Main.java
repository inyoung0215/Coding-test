package week7.kyungjunkim.q1;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int map[][] = new int[N][N];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int k=0; k<N; k++) {
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    if(map[i][k] == 1 && map[k][j] == 1)
                        map[i][j] = 1;
                }
            }
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                bw.write(String.valueOf(map[i][j]+" "));
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}




