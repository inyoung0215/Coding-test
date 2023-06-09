package week3.SonYoungJun.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> Hset = new HashSet<>();
        for(int i=0; i<N; i++) {
            Hset.add(br.readLine());
        }
        int count = 0;
        for(int i=0; i<M; i++) {
            String s = br.readLine();
            if(Hset.contains(s))
                count++;
        }
        System.out.print(count);
    }
}