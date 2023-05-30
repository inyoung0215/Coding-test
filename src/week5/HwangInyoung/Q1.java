package week5.HwangInyoung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int start = 1;
        int end = 1;
        int sum = 0;
        int count = 0;

        while (start <= n){
            if (sum < n){
                sum += end;
                end++;
            } else if (sum > n){
                sum -= start;
                start++;
            } else {
                count++;
                sum -= start;
                start++;
            }
        }
        System.out.println(count);
    }
}
