package week5.kyungjunkim.q2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int count = 0;

        while(true) {
            if(N%5==0) {
                count += N / 5;
                bw.write(Integer.toString(count));
                break;
            }
            else {
                N -= 3;
                count++;
            }
            if(N<0) {
                bw.write("-1");
                break;
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
