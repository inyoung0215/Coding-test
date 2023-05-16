package week4.SonYoungJun.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            Queue<Integer> q = new LinkedList<>();
            Queue<Integer> indexQ = new LinkedList<>();
            for(int i=0; i<N; i++) {
                q.add(Integer.parseInt(st.nextToken()));
                indexQ.add(i);
            }
            int count = 0;
            while(!q.isEmpty()) {
                int max = Collections.max(q);
                int temp = q.poll();
                int idx = indexQ.poll();
                if(temp == max) {
                    if(idx == M) {
                        sb.append(++count + "\n");
                        break;
                    }
                    count++;
                } else {
                    q.add(temp);
                    indexQ.add(idx);
                }
            }
        }
        System.out.print(sb);
    }
}