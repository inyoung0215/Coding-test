package week3.HwangInyoung;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(upper(num, arr) - lower(num, arr) + " ");
        }
        System.out.println(sb);

    }

    public static int lower(int num, int[] arr){
        int start = 0;
        int last = arr.length;
        while (start < last){
            int mid = (start + last) / 2;
            if (num <= arr[mid]){
                last = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int upper(int num, int[] arr){
        int start = 0;
        int last = arr.length;
        while (start < last){
            int mid = (start + last) / 2;
            if (num >= arr[mid]){
                start = mid + 1;
            } else {
                last = mid;
            }
        }
        return start;
    }
}
