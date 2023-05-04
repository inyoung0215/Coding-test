package week2.kyungjunkim.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> q = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0; i<=n; i++) {
            q.add(i);
        }

        st = new StringTokenizer(br.readLine());
        int count = 0;

        for(int i=0; i<m; i++) {
            int target = Integer.parseInt(st.nextToken());

            if(q.get(1) == target) {
                q.remove(1);
                continue;
            }

            int index = q.indexOf(target);
            int half = q.size()/2;

            if(index <= half) {
                while(q.get(1) != target) {
                    int temp = q.remove(1);
                    q.add(temp);
                    count++;
                }
                q.remove(1);
            }
            else {
                while(q.get(1) != target) {
                    int temp = q.remove(q.size()-1);
                    q.add(1, temp);
                    count++;
                }
                q.remove(1);
            }
        }

        System.out.println(count);
    }
}