package week6.HwangInyoung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 666;

        while (count < n){
            if (String.valueOf(num).contains("666")){
                count++;
            }
            num++;
        }
        System.out.println(num-1);
        br.close();
    }
}
