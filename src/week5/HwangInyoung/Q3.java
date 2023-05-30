package week5.HwangInyoung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<String> listA = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String a = br.readLine();
            listA.add(a);
        }

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < m; i++){
            String b = br.readLine();
            set.add(b);
        }

        List<String> result = new ArrayList<>();
        int count = 0;
        for(String s : listA){
            if (set.contains(s)){
                count++;
                result.add(s);
            }
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");

        for (String s : result){
            sb.append(s).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
