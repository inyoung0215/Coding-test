package week3.HwangInyoung;

import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println("Enter");
        int n = Integer.parseInt(st.nextToken());
        System.out.println("Enter");
        long s = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int length = 100001, sum = 0;
        int left = 0, right = 0;
        while(true){
            if(sum >= s){
                sum -= arr[left++];
                length = Math.min(length, (right - left) + 1);
            }
            else if(right == n) break;
            else sum += arr[right++];
        }
        if(length == 100001){
            bw.write(0 + "\n");
        } else {
            bw.write(length + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}